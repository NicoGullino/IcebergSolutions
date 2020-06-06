package educacionit.rest_controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import educacionit.jpa.dao.ProductoDAO;
import educacionit.jpa.entidades.Producto;


//Indicamos que es un controlador rest
@RestController
@RequestMapping("/api/productos") //esta sera la raiz de la url, es decir http://127.0.0.1:8080/api/
public class ProductoRestController {
	
	@Autowired
	private ProductoDAO productoDao;

	
//	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
//	http://localhost:8080/api/productos/
	
	@GetMapping
	public Iterable<Producto> findAll(){
		//retornará todos los productos
		return productoDao.findAll();

	}


	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url + el id de un domicilio
	http://localhost:8080/api/productos/1    
	*/
	@GetMapping("/{productoId}")
	public Optional<Producto> getProducto(@PathVariable int productoId){
		Optional<Producto> producto = productoDao.findById(productoId);
		
		if(producto == null) {
			throw new RuntimeException("Producto id not found -"+ productoId);
		}
		//retornará al usuario con id pasado en la url
		return producto;
	}
	
	//Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
	//http://localhost:8080/api/productos/
	@PostMapping
	public Producto addProducto(@RequestBody Producto producto) {
		
		//Este metodo guardará al usuario enviado
		productoDao.save(producto);
		
		return producto;
		
	}
	//Este método se hará cuando por una petición PUT (como indica la anotación) se llame a la url
	//http://127.0.0.1:8080/api/productos/
	@PutMapping
	public Producto updateProducto(@RequestBody Producto producto) {
		
		productoDao.save(producto);
		
		//este metodo actualizará al usuario enviado
		
		return producto;
	}
	
	/*Este método se hará cuando por una petición DELETE (como indica la anotación) se llame a la url + id del domicilio
	http://localhost:8080/api/productos/1   */
	@DeleteMapping("/{productoId}")
	public String deteteDomicilio(@PathVariable int productoId) {
		
		Optional<Producto> domicilio = productoDao.findById(productoId);
		
		if(domicilio == null) {
			throw new RuntimeException("Domicilio id not found -"+ productoId);
		}
		
		productoDao.deleteById(productoId);
		
		//Esto método, recibira el id de un usuario por URL y se borrará de la bd.
		return "Deleted Producto id - "+productoId;
	}
}
