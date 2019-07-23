package com.visa.training.jpa.dal;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.visa.training.jpa.domain.Product;

public class JpaProductDAO {
	
	public List<Product> findAll(){
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		Query q = em.createQuery("select p from product as p");
		List<Product> all = q.getResultList();
		em.close();
		return all;
	}
	
	public List<Product> findByPriceGreaterThan(float price){
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		Query q = em.createQuery("select p from product as p where p.price > :priceParam");
		q.setParameter("priceParam", price);
		List<Product> all = q.getResultList();
		em.close();
		return all;
	}

    public Product save(Product p) {
        EntityManagerFactory emf = JpaUtil.getEmf();
        EntityManager em = emf.createEntityManager();
        try {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(p);
            tx.commit();
        } finally {
            em.close();
        }
        return p;
    }

    public Product findById(int id) {
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        try {
            Product p = em.find(Product.class, id);
            return p;
        } finally {
            em.close();
        }
    }

    public void update(Product detached) {
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(detached);
        tx.commit();
        em.close();
    }

    public void remove(int id) {
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Product toBeRemoved = em.find(Product.class, id);
        if (toBeRemoved != null) {
            em.remove(toBeRemoved);
        }
        tx.commit();
        em.close();

    }

}

