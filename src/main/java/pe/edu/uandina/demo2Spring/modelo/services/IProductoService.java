package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
}
