package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.uandina.demo2Spring.modelo.DetalleReserva;
import pe.edu.uandina.demo2Spring.modelo.dao.IDetalleReservaDao;

import java.util.List;

public class DetalleReservaServiceImpl implements IDetalleReservaService{
    @Autowired
    private IDetalleReservaDao detallereservadao;
    @Override
    public List<DetalleReserva> findAll() {
        return (List<DetalleReserva>) detallereservadao.findAll();
    }
}
