package educacionit.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;

import educacionit.jpa.dto.PersonaDTO;
import educacionit.jpa.entidades.Persona;

@Service
@NamedQueries({
	  @NamedQuery(name = "find mayor de edad" , query = "Select p from Persona p where edad > = 17"),
	  @NamedQuery(name = "find by apellido" , query = "Select p from Persona p where apellido = :apellido")
	})
public class PersonaDAOImpl {

	@PersistenceContext
	private EntityManager em;

	public Long cuantasPersonasHay() {
		Query query = em.createQuery("SELECT COUNT(p) FROM Persona p");
		Long result = (Long) query.getSingleResult();
		System.out.println(result);
		em.close();
		return result;
	}
	
	public List findByName(String nombre) {
		Query query = em.createQuery("Select p from Persona p JOIN FETCH p.telefonos where p.nombre = :name");
		query.setParameter("name", nombre);
		return query.getResultList();
	}
	
	
	public List findMayorDeEdad() {
		return em.createNamedQuery("find mayor de edad").getResultList();
	}
	
	public List findByApellido(String apellido) {
		Query query = em.createNamedQuery("find by apellido");
		query.setParameter("apellido", apellido);
		return query.getResultList();
	}
	
	public List getAllApellidosMayuscula() {
		return em.createQuery("Select UPPER(p.apellido) from Persona p").getResultList();
	}
	
	public List<PersonaDTO> getPersonaDTO(){
		return em.createQuery("select new educacionit.jpa.dto.PersonaDTO(p.nombre, p.id) from Persona p", PersonaDTO.class).getResultList();
	}
	
	public List<Persona> findByEdad(int edad){
	CriteriaBuilder builder = em.getCriteriaBuilder();
	CriteriaQuery<Persona> criteria = builder.createQuery(Persona.class);
	 
	Root<Persona> root = criteria.from(Persona.class);
	 
	criteria.where(
	    builder.equal(root.get("edad"), edad)
	);
	 
	return em.createQuery(criteria).getResultList();
	 
	}
		
	
}
