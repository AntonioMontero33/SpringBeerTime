package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Local;

public interface ILocalDao extends CrudRepository<Local,Long> {
}
