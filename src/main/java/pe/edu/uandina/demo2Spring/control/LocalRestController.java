package pe.edu.uandina.demo2Spring.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Local;
import pe.edu.uandina.demo2Spring.modelo.services.ILocalService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LocalRestController {
    @Autowired
    private ILocalService localService;

    @GetMapping("/local")
    public List<Local> listar(){
        return localService.findAll();
    }

    @GetMapping("/local/{id}")
    public Local mostrar(@PathVariable Long id){
        return localService.findById(id);
    }

    @PostMapping("/local")
    @ResponseStatus(HttpStatus.CREATED)
    public Local crear(@RequestBody Local local){
        return localService.save(local);
    }

    @PutMapping("/local/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Local actualizar(@RequestBody Local local,@PathVariable Long id){
        Local localOriginal = localService.findById(id);
        localOriginal.setNombreLocal(local.getNombreLocal());
        return localService.save(localOriginal);
    }

    @DeleteMapping("/local/{id}")
    public void eliminar(@PathVariable Long id){
        localService.delete(id);
    }
}
