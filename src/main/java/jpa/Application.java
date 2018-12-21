package jpa;

import jpa.domain.Deal;

import javax.persistence.Persistence;

/**
 * Created by kwonsungyang on 21/12/2018
 */
public class Application {
    public static void main(String[] args) {
        final var emf = Persistence.createEntityManagerFactory("jpa");
        final var em = emf.createEntityManager();
        final var tx = em.getTransaction();

        tx.begin();
        em.persist(new Deal());
        tx.commit();

        em.close();
        emf.close();
    }
}
