package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.uandina.demo2Spring.modelo.ProductoLocal;
import pe.edu.uandina.demo2Spring.modelo.dao.IProductoLocalDao;

import java.util.List;

public class ProductoLocalServiceImpl implements IProductoLocalService{
    @Autowired
    private IProductoLocalDao productoLocalDao;
    @Override
    public List<ProductoLocal> findAll() {
        return (List<ProductoLocal>) productoLocalDao.findAll();
    }
}
