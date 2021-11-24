package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.uandina.demo2Spring.modelo.Categoria;
import pe.edu.uandina.demo2Spring.modelo.dao.ICategoriaDao;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
    @Autowired
    private ICategoriaDao categoriaDao;
    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaDao.findAll();
    }
    @Override
    public Categoria findById(Long id) {
        return categoriaDao.findById(id).orElse(null);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    public void delete(Long id) {
        categoriaDao.deleteById(id);
    }
}
