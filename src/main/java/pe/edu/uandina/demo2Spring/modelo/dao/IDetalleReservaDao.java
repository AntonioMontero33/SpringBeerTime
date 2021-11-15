package pe.edu.uandina.demo2Spring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demo2Spring.modelo.DetalleReserva;

public interface IDetalleReservaDao extends CrudRepository<DetalleReserva,Long> {

}
