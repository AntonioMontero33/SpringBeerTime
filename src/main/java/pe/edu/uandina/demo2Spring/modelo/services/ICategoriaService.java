package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Categoria;

import java.util.List;

public interface ICategoriaService {
    public List<Categoria> findAll();
    public Categoria findById(Long id);
    public Categoria save(Categoria categoria);
    public void delete(Long id);

}
