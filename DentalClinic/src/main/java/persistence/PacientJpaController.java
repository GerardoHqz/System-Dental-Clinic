package persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logic.Pacient;
import persistence.exceptions.NonexistentEntityException;

public class PacientJpaController implements Serializable {

    public PacientJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public PacientJpaController() {
        emf = Persistence.createEntityManagerFactory("DentalClinic_PU");
    }

    public void create(Pacient pacient) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pacient);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pacient pacient) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pacient = em.merge(pacient);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pacient.getId_();
                if (findPacient(id) == null) {
                    throw new NonexistentEntityException("The pacient with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pacient pacient;
            try {
                pacient = em.getReference(Pacient.class, id);
                pacient.getId_();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pacient with id " + id + " no longer exists.", enfe);
            }
            em.remove(pacient);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pacient> findPacientEntities() {
        return findPacientEntities(true, -1, -1);
    }

    public List<Pacient> findPacientEntities(int maxResults, int firstResult) {
        return findPacientEntities(false, maxResults, firstResult);
    }

    private List<Pacient> findPacientEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pacient.class));
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

    public Pacient findPacient(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pacient.class, id);
        } finally {
            em.close();
        }
    }

    public int getPacientCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pacient> rt = cq.from(Pacient.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
