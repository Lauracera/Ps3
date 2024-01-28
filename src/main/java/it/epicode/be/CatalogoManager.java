package it.epicode.be;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CatalogoManager {
    private EntityManagerFactory emf;
    private EntityManager em;

    public CatalogoManager() {
        emf = Persistence.createEntityManagerFactory("CatalogoPU");
        em = emf.createEntityManager();
    }

    public void aggiungiElemento(Elemento elemento) {
        em.getTransaction().begin();
        em.persist(elemento);
        em.getTransaction().commit();
    }

    public void rimuoviElemento(String isbn) {
        em.getTransaction().begin();
        Elemento elemento = em.find(Elemento.class, isbn);
        em.remove(elemento);
        em.getTransaction().commit();
    }

}
