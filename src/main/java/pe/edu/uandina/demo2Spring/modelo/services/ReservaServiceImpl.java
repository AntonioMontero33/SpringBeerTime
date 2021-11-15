package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.uandina.demo2Spring.modelo.Reserva;
import pe.edu.uandina.demo2Spring.modelo.Usuario;
import pe.edu.uandina.demo2Spring.modelo.dao.IRerservaDao;

import java.util.List;

public class ReservaServiceImpl implements IReservaService{
    @Autowired
    private IRerservaDao rerservaDao;
    @Override
    public List<Reserva> findAll() {
        return (List<Reserva>) rerservaDao.findAll();
    }
}
