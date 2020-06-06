package educacionit.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import educacionit.jpa.entidades.Producto;

@Service
public class ProductoDAOImpl {

	@PersistenceContext
	private EntityManager em;

	public Double findMaxPrecio() {
		Query query = em.createQuery("SELECT Max(p.precio) FROM Producto p");
		Double result = (Double) query.getSingleResult();
		em.close();
		return result;
	}
	
	public Double findMinPrecio() {
		Query query = em.createQuery("SELECT Min(p.precio) FROM Producto p");
		Double result = (Double) query.getSingleResult();
		em.close();
		return result;
	}
	
	
	public Double findPromedioPrecio() {
		Query query = em.createQuery("SELECT Avg(p.precio) FROM Producto p");
		Double result = (Double) query.getSingleResult();
		em.close();
		return result;
	}
	
	public List<Producto> find3Top() {
		Query query = em.createQuery("FROM Producto p order by p.precio desc");
		query.setMaxResults(3);
		List result = query.getResultList();
		em.close();
		return result;
	}
	
	
		
	
}
