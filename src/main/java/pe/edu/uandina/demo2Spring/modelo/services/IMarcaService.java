package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Marca;

import java.util.List;

public interface IMarcaService {
    public List<Marca> findAll();
    public Marca findById(Long id);
    public Marca save(Marca marca);
    public void delete(Long id);
}
