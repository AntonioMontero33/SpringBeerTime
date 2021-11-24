package pe.edu.uandina.demo2Spring.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Producto;
import pe.edu.uandina.demo2Spring.modelo.services.IProductoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoRestController {
    @Autowired
    private IProductoService productoService;

    @GetMapping("/producto")
    public List<Producto> listar(){
        return productoService.findAll();
    }

    @GetMapping("/producto/{id}")
    public Producto mostrar(@PathVariable Long id){
        return productoService.findById(id);
    }

    @PostMapping("/producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto crear(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @PutMapping("/producto/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Producto actualizar(@RequestBody Producto producto, @PathVariable Long id){
        Producto productoOriginal = productoService.findById(id);
        productoOriginal.setNombreProducto(producto.getNombreProducto());
        return productoService.save(productoOriginal);
    }
}
