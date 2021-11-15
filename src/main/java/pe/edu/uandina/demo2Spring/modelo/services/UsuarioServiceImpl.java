package pe.edu.uandina.demo2Spring.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.uandina.demo2Spring.modelo.Usuario;
import pe.edu.uandina.demo2Spring.modelo.dao.IUsuarioDao;

import java.util.List;

public class UsuarioServiceImpl implements IUsuarioService{
    @Autowired
    private IUsuarioDao usuarioDao;
    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }
}
