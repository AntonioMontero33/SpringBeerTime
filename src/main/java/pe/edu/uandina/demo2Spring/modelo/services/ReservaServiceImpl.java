package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Reserva;
import pe.edu.uandina.demo2Spring.modelo.Usuario;
import pe.edu.uandina.demo2Spring.modelo.dao.IRerservaDao;

import java.util.List;

@Service
public class ReservaServiceImpl implements IReservaService{
    @Autowired
    private IRerservaDao reservaDao;
    @Override
    @Transactional(readOnly = true)
    public List<Reserva> findAll() {
        return (List<Reserva>) reservaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Reserva findById(Long id) {
        return reservaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Reserva save(Reserva reserva) {
        return reservaDao.save(reserva);
    }

    @Override
    public void delete(Long id) {
        reservaDao.deleteById(id);
    }
}
