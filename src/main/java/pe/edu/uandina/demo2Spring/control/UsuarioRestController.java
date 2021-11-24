package pe.edu.uandina.demo2Spring.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Usuario;
import pe.edu.uandina.demo2Spring.modelo.services.IUsuarioService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> listar(){
        return  usuarioService.findAll();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario mostrar(@PathVariable Long id){
        return usuarioService.findById(id);
    }

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario crear(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Usuario actualizar(@RequestBody Usuario usuario,@PathVariable Long id){
        Usuario usuario1 = usuarioService.findById(id);
        usuario1.setUsuario(usuario.getUsuario());
        usuario1.setNombreUsuario(usuario.getNombreUsuario());
        usuario1.setApellidoUsuario(usuario.getApellidoUsuario());
        usuario1.setDniUsuario(usuario.getDniUsuario());
        usuario1.setCelular(usuario.getContrasena());
        usuario1.setContrasena(usuario.getContrasena());
        usuario1.setCorreo(usuario.getCorreo());
        usuario1.setDireccion(usuario.getDireccion());
        usuario1.setReservas(usuario.getReservas());
        return usuarioService.save(usuario1);
    }

    @DeleteMapping("/usuarios/{id}")
    public void eliminar(@PathVariable Long id){
        usuarioService.delete(id);
    }
}
