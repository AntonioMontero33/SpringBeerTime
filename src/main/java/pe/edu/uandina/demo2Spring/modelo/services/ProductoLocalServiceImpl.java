package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.demo2Spring.modelo.ProductoLocal;
import pe.edu.uandina.demo2Spring.modelo.dao.IProductoLocalDao;

import java.util.List;


@Service
public class ProductoLocalServiceImpl implements IProductoLocalService{
    @Autowired
    private IProductoLocalDao productoLocalDao;
    @Override
    @Transactional(readOnly = true)
    public List<ProductoLocal> findAll() {
        return (List<ProductoLocal>) productoLocalDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ProductoLocal findById(Long id) {
        return productoLocalDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public ProductoLocal save(ProductoLocal productoLocal) {
        return productoLocalDao.save(productoLocal);
    }

    @Override
    public void delete(Long id) {
        productoLocalDao.deleteById(id);
    }
}
