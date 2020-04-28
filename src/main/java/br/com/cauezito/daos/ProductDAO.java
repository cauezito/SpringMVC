package br.com.cauezito.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.cauezito.store.models.Product;

@Repository
public class ProductDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void save(Product product) {
		em.persist(product);
	}

}
