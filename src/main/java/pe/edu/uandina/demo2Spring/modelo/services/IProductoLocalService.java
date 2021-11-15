package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.ProductoLocal;

import java.util.List;

public interface IProductoLocalService {
    public List<ProductoLocal> findAll();
}
