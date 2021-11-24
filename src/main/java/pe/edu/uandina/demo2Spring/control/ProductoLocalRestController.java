package pe.edu.uandina.demo2Spring.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.ProductoLocal;
import pe.edu.uandina.demo2Spring.modelo.services.IProductoLocalService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoLocalRestController {
    @Autowired
    private IProductoLocalService productoLocalService;


    @GetMapping("/productolocal")
    public List<ProductoLocal> listar(){
        return productoLocalService.findAll();
    }

    @GetMapping("productolocal/{id}")
    public ProductoLocal mostrar(@PathVariable Long id){
        return productoLocalService.findById(id);
    }

    @PostMapping("/productolocal")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductoLocal crear(@RequestBody ProductoLocal productoLocal){
        return productoLocalService.save(productoLocal);
    }

    @PutMapping("productolocal/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ProductoLocal actualizar(@RequestBody ProductoLocal productoLocal, @PathVariable Long id){
        ProductoLocal productoLocalOriginal = productoLocalService.findById(id);
        productoLocalOriginal.setPrecioProductoLocal(productoLocal.getPrecioProductoLocal());
        return productoLocalService.save(productoLocalOriginal);
    }
}
