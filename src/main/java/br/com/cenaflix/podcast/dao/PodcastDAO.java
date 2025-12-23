package br.com.cenaflix.podcast.dao;

import br.com.cenaflix.podcast.model.Podcast;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class PodcastDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("cenaflixPU");

    // Salvar um novo podcast
    public void salvar(Podcast podcast) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(podcast);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    // Listar todos os podcasts
    public List<Podcast> listarTodos() {
        EntityManager em = emf.createEntityManager();
        List<Podcast> lista = null;
        try {
            lista = em.createQuery("SELECT p FROM Podcast p", Podcast.class).getResultList();
        } finally {
            em.close();
        }
        return lista;
    }

    // Listar podcasts filtrando por produtor
    public List<Podcast> listarPorProdutor(String produtor) {
        EntityManager em = emf.createEntityManager();
        List<Podcast> lista = null;
        try {
            lista = em.createQuery("SELECT p FROM Podcast p WHERE p.produtor LIKE :produtor", Podcast.class)
                      .setParameter("produtor", "%" + produtor + "%")
                      .getResultList();
        } finally {
            em.close();
        }
        return lista;
    }
    
    public void excluir(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();        
            Podcast podcast = em.find(Podcast.class, id);
            if (podcast != null) {
                em.remove(podcast); // remove do banco
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}
