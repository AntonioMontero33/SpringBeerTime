package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.Reserva;

public interface IRerservaDao extends CrudRepository<Reserva,Long> {
}
