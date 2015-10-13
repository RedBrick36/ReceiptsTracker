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
public class TechsJpaController implements Serializable {

    public TechsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Techs techs) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(techs);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTechs(techs.getName()) != null) {
                throw new PreexistingEntityException("Techs " + techs + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Techs techs) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            techs = em.merge(techs);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = techs.getName();
                if (findTechs(id) == null) {
                    throw new NonexistentEntityException("The techs with id " + id + " no longer exists.");
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
            Techs techs;
            try {
                techs = em.getReference(Techs.class, id);
                techs.getName();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The techs with id " + id + " no longer exists.", enfe);
            }
            em.remove(techs);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Techs> findTechsEntities() {
        return findTechsEntities(true, -1, -1);
    }

    public List<Techs> findTechsEntities(int maxResults, int firstResult) {
        return findTechsEntities(false, maxResults, firstResult);
    }

    private List<Techs> findTechsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Techs.class));
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

    public Techs findTechs(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Techs.class, id);
        } finally {
            em.close();
        }
    }

    public int getTechsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Techs> rt = cq.from(Techs.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
