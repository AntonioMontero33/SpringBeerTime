package pe.edu.uandina.demo2Spring.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.uandina.demo2Spring.modelo.Reserva;
import pe.edu.uandina.demo2Spring.modelo.services.IReservaService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservaRestController {
    @Autowired
    private IReservaService reservaService;


    @GetMapping("/reserva")
    public List<Reserva> listar(){
        return reservaService.findAll();
    }

    @GetMapping("/reserva/{id}")
    public Reserva mostrar(@PathVariable Long id){
        return reservaService.findById(id);
    }

    @PostMapping("/reserva")
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva crear(@RequestBody Reserva reserva){
        return reservaService.save(reserva);
    }

    @PutMapping("/reserva/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Reserva actualizar(@RequestBody Reserva reserva, @PathVariable Long id){
        Reserva reservaOriginal = reservaService.findById(id);
        reservaOriginal.setFechaReserva(reserva.getFechaReserva());
        return reservaService.save(reservaOriginal);
    }
}
