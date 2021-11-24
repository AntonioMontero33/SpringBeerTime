package pe.edu.uandina.demo2Spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Marca;
import pe.edu.uandina.demo2Spring.modelo.services.IMarcaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MarcaRestController {
    @Autowired
    private IMarcaService marcaService;

    @GetMapping("/marca")
    public List<Marca> listar(){
        return marcaService.findAll();
    }

    @GetMapping("/marca/{id}")
    public Marca mostrar(@PathVariable Long id){
        return marcaService.findById(id);
    }

    @PostMapping("/marca")
    @ResponseStatus(HttpStatus.CREATED)
    public Marca crear(@RequestBody Marca marca){
        return marcaService.save(marca);
    }

    @PutMapping("/marca/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Marca actualizar(@RequestBody Marca marca,@PathVariable Long id){
        Marca marcaOriginal = marcaService.findById(id);
        marcaOriginal.setNombreMarca(marca.getNombreMarca());
        return marcaService.save(marcaOriginal);
    }

    @DeleteMapping("/marca/{id}")
    public void  eliminar(@PathVariable Long id){
        marcaService.delete(id);
    }
}
