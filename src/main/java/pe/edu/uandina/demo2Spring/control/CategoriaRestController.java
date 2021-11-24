package pe.edu.uandina.demo2Spring.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Categoria;
import pe.edu.uandina.demo2Spring.modelo.services.ICategoriaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoriaRestController {
    @Autowired
    private ICategoriaService categoriaService;


    @GetMapping("/categoria")
    public List<Categoria> listar(){
        return categoriaService.findAll();
    }

    @GetMapping("categoria/{id}")
    public Categoria mostrar(@PathVariable Long id){
        return categoriaService.findById(id);
    }

    @PostMapping("/categoria")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria crear(@RequestBody Categoria categoria){
        return categoriaService.save(categoria);
    }

    @PutMapping("/categoria/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Categoria actualizar(@RequestBody Categoria categoria, @PathVariable Long id){
        Categoria catoriaNueva = categoriaService.findById(id);
        catoriaNueva.setProductos(categoria.getProductos());
        catoriaNueva.setNombreCategoria(categoria.getNombreCategoria());
        return categoriaService.save(catoriaNueva);
    }
}
