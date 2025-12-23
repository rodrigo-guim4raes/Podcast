package br.com.cenaflix.podcast.dao;

import br.com.cenaflix.podcast.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;

public class UsuarioDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("cenaflixPU");

    public Usuario autenticar(String login, String senha) {
        EntityManager em = emf.createEntityManager();
        Usuario usuario = null;

        try {
            usuario = em.createQuery(
        "SELECT u FROM Usuario u WHERE u.nome = :nome AND u.senha = :senha", Usuario.class)
                .setParameter("nome", login)
                .setParameter("senha", senha)
                .getSingleResult();

        } catch (NoResultException e) {            
            usuario = null;
        } finally {
            em.close();
        }

        return usuario;
    }
}
