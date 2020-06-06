package educacionit.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import educacionit.jpa.dao.PersonaDAO;
import educacionit.jpa.dao.PersonaDAOImpl;
import educacionit.jpa.dao.ProductoDAO;
import educacionit.jpa.dao.ProductoDAOImpl;
import educacionit.rest_controllers.ProductoRestController;

@SpringBootApplication
@ComponentScan("educacionit.*")
public class JpaApplication implements CommandLineRunner{

	
	//@Autowired
	//ProductoRestController service;
	
//	  @Autowired
//	  PersonaDAO dao;
	  
	  //@Autowired
	  //ProductoDAO productoDao;
	  
	  //@Autowired
	  //PersonaDAOImpl daoImpl;
	  
	  //@Autowired
	  //ProductoDAOImpl productoDaoImpl;
	  
	  public static void main(String[] args) {
	    SpringApplication.run(JpaApplication.class, args);
	  }
	  @Override
	  public void run(String... args) throws Exception {
		  
//		  Producto prod = new Producto();
//		  prod.setDescripcion("algo4");
//		  prod.setFechaAlta(new Date());
//		  prod.setPrecio(888.4);
//		  
//		  productoDao.save(prod);
//	  
//		  System.out.println(productoDao.findByDescripcion("algo").size());
		  
		  
		 // System.out.println(productoDaoImpl.findPromedioPrecio());
		  
		//  productoDao.
		  
//		  Producto pepe = new Producto();
//		  pepe.setId(1);
//		  pepe.setDescripcion("algo");
//		  pepe.setFechaAlta(new Date());
//		  pepe.setPrecio(3333d);
		  
//		  List<Producto> prods = productoDaoImpl.find3Top();
//		  for (Producto producto : prods) {
//			System.out.println(producto.getPrecio() + ", " + producto.getDescripcion());
//		}
		  
//		  Persona p = new Persona();
//		  p.setApellido("Gomez");
//		  p.setNombre("Pepe");
//		  p.setEdad(17);
//		  
//		  Telefono t = new Telefono();
//		  t.setNumero(899999991);
//		  t.setTipo("Celu");
//		  p.addTelefono(t);
//		  dao.save(p);
//		  
		//  dao.findByName("Maxi").forEach((persona)->System.out.println(persona.getApellido()));
		  //daoImpl.cuantasPersonasHay();
//		 List<Persona> personas = daoImpl.findByName("Pepe");
//		 for (Persona persona : personas) {
//			System.out.println(persona.getNombre() + ", " + persona.getApellido());
//			System.out.println(persona.getTelefonos().get(0).getNumero());
//		}
		  
//		 Persona p = dao.findById(1).get();
//		 System.out.println(p.getApellido());
		  
//		 List personas =  dao.findAll();
//		 System.out.println(personas.size());
		 
//		 List apellidos = daoImpl.getAllApellidosMayuscula();
//		 for (Object object : apellidos) {
//			System.out.println(object);
//		}
		  
//		  List<PersonaDTO> lista = daoImpl.getPersonaDTO();
//		  for (PersonaDTO personaDTO : lista) {
//			System.out.println(personaDTO.getNombre() + ", " + personaDTO.getNumero());
//		}
//		  
//		  List<Persona> personas = daoImpl.findByEdad(17);
//		 for (Persona persona : personas) {
//			System.out.println(persona.getApellido());
//		}
		
//		  Producto producto = new Producto();
//		  producto.setDescripcion("Lavavajillas");
//		  producto.setFechaAlta(new Date());
//		  producto.setPrecio(40000d);		  
//		  productoDao.save(producto);
//		
//		  
//		  dao.findAll().forEach((p)->System.out.println(p.getDescripcion()));
	  }


}
