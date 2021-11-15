package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Producto;

public interface IProductoDao extends CrudRepository<Producto,Long> {
}
