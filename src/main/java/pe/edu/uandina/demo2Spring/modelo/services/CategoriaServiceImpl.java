package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.uandina.demo2Spring.modelo.Categoria;
import pe.edu.uandina.demo2Spring.modelo.dao.ICategoriaDao;

import java.util.List;

public class CategoriaServiceImpl implements ICategoriaService{
    @Autowired
    private ICategoriaDao categoriaDao;
    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaDao.findAll();
    }
}
