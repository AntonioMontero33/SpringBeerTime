package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uandina.demo2Spring.modelo.Categoria;
import pe.edu.uandina.demo2Spring.modelo.DetalleReserva;
import pe.edu.uandina.demo2Spring.modelo.dao.IDetalleReservaDao;

import java.util.List;

@Service
public class DetalleReservaServiceImpl implements IDetalleReservaService{
    @Autowired
    private IDetalleReservaDao detallereservaDao;
    @Override
    public List<DetalleReserva> findAll() {
        return (List<DetalleReserva>) detallereservaDao.findAll();
    }

    @Override
    public DetalleReserva findById(Long id) {
        return detallereservaDao.findById(id).orElse(null);
    }

    @Override
    public DetalleReserva save(DetalleReserva detalleReserva) {
        return detallereservaDao.save(detalleReserva);
    }

    @Override
    public void delete(Long id) {
        detallereservaDao.deleteById(id);
    }
}
