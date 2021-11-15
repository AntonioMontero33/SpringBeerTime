package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Marca;

public interface IMarcaDao extends CrudRepository<Marca,Long> {
}
