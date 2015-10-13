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
public class NonjobrelatedJpaController implements Serializable {

    public NonjobrelatedJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Nonjobrelated nonjobrelated) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(nonjobrelated);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findNonjobrelated(nonjobrelated.getTech()) != null) {
                throw new PreexistingEntityException("Nonjobrelated " + nonjobrelated + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Nonjobrelated nonjobrelated) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            nonjobrelated = em.merge(nonjobrelated);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = nonjobrelated.getTech();
                if (findNonjobrelated(id) == null) {
                    throw new NonexistentEntityException("The nonjobrelated with id " + id + " no longer exists.");
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
            Nonjobrelated nonjobrelated;
            try {
                nonjobrelated = em.getReference(Nonjobrelated.class, id);
                nonjobrelated.getTech();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The nonjobrelated with id " + id + " no longer exists.", enfe);
            }
            em.remove(nonjobrelated);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Nonjobrelated> findNonjobrelatedEntities() {
        return findNonjobrelatedEntities(true, -1, -1);
    }

    public List<Nonjobrelated> findNonjobrelatedEntities(int maxResults, int firstResult) {
        return findNonjobrelatedEntities(false, maxResults, firstResult);
    }

    private List<Nonjobrelated> findNonjobrelatedEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Nonjobrelated.class));
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

    public Nonjobrelated findNonjobrelated(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Nonjobrelated.class, id);
        } finally {
            em.close();
        }
    }

    public int getNonjobrelatedCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Nonjobrelated> rt = cq.from(Nonjobrelated.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
