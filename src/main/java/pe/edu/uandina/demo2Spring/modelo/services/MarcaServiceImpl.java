package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.Marca;
import pe.edu.uandina.demo2Spring.modelo.dao.IMarcaDao;

import java.util.List;


@Service
public class MarcaServiceImpl implements IMarcaService{
    @Autowired
    private IMarcaDao marcaDao;
    @Override
    @Transactional(readOnly = true)
    public List<Marca> findAll() {
        return (List<Marca>) marcaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Marca findById(Long id) {
        return marcaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Marca save(Marca marca) {
        return  marcaDao.save(marca);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        marcaDao.deleteById(id);
    }
}
