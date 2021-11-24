package pe.edu.uandina.demo2Spring.modelo.services;

import pe.edu.uandina.demo2Spring.modelo.Reserva;
import pe.edu.uandina.demo2Spring.modelo.Usuario;

import java.util.List;

public interface IReservaService{
    public List<Reserva> findAll();
    public Reserva findById(Long id);
    public Reserva save(Reserva reserva);
    public void delete(Long id);
}
