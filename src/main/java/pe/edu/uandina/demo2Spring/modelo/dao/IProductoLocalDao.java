package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.ProductoLocal;

public interface IProductoLocalDao extends CrudRepository<ProductoLocal,Long> {
}
