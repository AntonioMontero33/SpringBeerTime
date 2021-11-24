package pe.edu.uandina.demo2Spring.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.DetalleReserva;
import pe.edu.uandina.demo2Spring.modelo.services.IDetalleReservaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DetalleReservaRestController {
    @Autowired
    private IDetalleReservaService detalleReservaService;


    @GetMapping("/detallereserva")
    public List<DetalleReserva> listar(){
        return detalleReservaService.findAll();
    }

    @GetMapping("detallereserva/{id}")
    public DetalleReserva mostrar(@PathVariable Long id){
        return detalleReservaService.findById(id);
    }

    @PostMapping("/detallereserva")
    @ResponseStatus(HttpStatus.CREATED)
    public DetalleReserva crear(@RequestBody DetalleReserva detalleReserva){
        return detalleReservaService.save(detalleReserva);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public DetalleReserva actualizar(@RequestBody DetalleReserva detalleReserva, @PathVariable Long id){
        DetalleReserva detalleReservaNueva = detalleReservaService.findById(id);
        detalleReservaNueva.setTieneProductoLocal(detalleReserva.getTieneProductoLocal());
        detalleReservaNueva.setCantidadDetalleReserva(detalleReserva.getCantidadDetalleReserva());
        detalleReservaNueva.setTieneReserva(detalleReserva.getTieneReserva());
        return detalleReservaService.save(detalleReservaNueva);
    }
}
