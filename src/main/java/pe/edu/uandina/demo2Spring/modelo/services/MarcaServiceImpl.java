package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.uandina.demo2Spring.modelo.Marca;
import pe.edu.uandina.demo2Spring.modelo.dao.IMarcaDao;

import java.util.List;

public class MarcaServiceImpl implements IMarcaService{
    @Autowired
    private IMarcaDao marcaDao;
    @Override
    public List<Marca> findAll() {
        return (List<Marca>) marcaDao.findAll();
    }
}
