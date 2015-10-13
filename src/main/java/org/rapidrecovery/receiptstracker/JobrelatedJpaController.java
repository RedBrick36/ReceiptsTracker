/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rapidrecovery.receiptstracker;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.rapidrecovery.receiptstracker.exceptions.NonexistentEntityException;
import org.rapidrecovery.receiptstracker.exceptions.PreexistingEntityException;

/**
 *
 * @author RedBrick
 */
public class JobrelatedJpaController implements Serializable {

    public JobrelatedJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Jobrelated jobrelated) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(jobrelated);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findJobrelated(jobrelated.getJobname()) != null) {
                throw new PreexistingEntityException("Jobrelated " + jobrelated + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Jobrelated jobrelated) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            jobrelated = em.merge(jobrelated);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = jobrelated.getJobname();
                if (findJobrelated(id) == null) {
                    throw new NonexistentEntityException("The jobrelated with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Jobrelated jobrelated;
            try {
                jobrelated = em.getReference(Jobrelated.class, id);
                jobrelated.getJobname();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The jobrelated with id " + id + " no longer exists.", enfe);
            }
            em.remove(jobrelated);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Jobrelated> findJobrelatedEntities() {
        return findJobrelatedEntities(true, -1, -1);
    }

    public List<Jobrelated> findJobrelatedEntities(int maxResults, int firstResult) {
        return findJobrelatedEntities(false, maxResults, firstResult);
    }

    private List<Jobrelated> findJobrelatedEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Jobrelated.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Jobrelated findJobrelated(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Jobrelated.class, id);
        } finally {
            em.close();
        }
    }

    public int getJobrelatedCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Jobrelated> rt = cq.from(Jobrelated.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
