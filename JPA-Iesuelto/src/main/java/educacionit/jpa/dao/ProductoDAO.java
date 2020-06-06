package educacionit.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import educacionit.jpa.entidades.Producto;
@Repository

public interface ProductoDAO extends CrudRepository<Producto, Integer>{
	
	@Query("from Producto p where p.descripcion = :descripcion")
	public List<Producto> findByDescripcion(@Param("descripcion") String descripcion);

}
