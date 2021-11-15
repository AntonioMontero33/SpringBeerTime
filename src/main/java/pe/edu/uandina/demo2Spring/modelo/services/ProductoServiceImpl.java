package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.uandina.demo2Spring.modelo.Producto;
import pe.edu.uandina.demo2Spring.modelo.dao.IProductoDao;

import java.util.List;

public class ProductoServiceImpl implements IProductoService{
    @Autowired
    private IProductoDao productoDao;
    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }
}
