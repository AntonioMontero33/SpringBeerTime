package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> findAll();
    public Usuario findById(Long id);
    public Usuario save(Usuario usuario);
    public void delete(Long id);
}
