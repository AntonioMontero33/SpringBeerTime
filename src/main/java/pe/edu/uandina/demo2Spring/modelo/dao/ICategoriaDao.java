package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria,Long> {

}
