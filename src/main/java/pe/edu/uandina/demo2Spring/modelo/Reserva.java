package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codreserva")
    private Long codReserva;
    @Column(name = "fechareserva")
    private Date fechaReserva;
    @Column(name = "estadoreserva")
    private boolean estadoReserva;
    @ManyToOne
    @JoinColumn(name = "tieneusuario", referencedColumnName = "codusuario")
    @JsonBackReference (value = "jsonUsuario")
    private Usuario tieneUsuario;
    @ManyToOne
    @JoinColumn(name = "tienelocal1", referencedColumnName = "codlocal")
    @JsonBackReference (value = "jsonLocal1")
    private Local tieneLocal1;
    @OneToMany(mappedBy = "tieneReserva")
    @JsonManagedReference (value = "jsonReserva")
    private List<DetalleReserva> detalleReservas;

    public Reserva() {
    }

    public Reserva(Long codReserva, Date fechaReserva, boolean estadoReserva, Usuario tieneUsuario, Local tieneLocal, List<DetalleReserva> detalleReservas) {
        this.codReserva = codReserva;
        this.fechaReserva = fechaReserva;
        this.estadoReserva = estadoReserva;
        this.tieneUsuario = tieneUsuario;
        this.tieneLocal1 = tieneLocal;
        this.detalleReservas = detalleReservas;
    }

    public Long getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(Long codReserva) {
        this.codReserva = codReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public boolean isEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(boolean estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Usuario getTieneUsuario() {
        return tieneUsuario;
    }

    public void setTieneUsuario(Usuario tieneUsuario) {
        this.tieneUsuario = tieneUsuario;
    }

    public Local getTieneLocal1() {
        return tieneLocal1;
    }

    public void setTieneLocal1(Local tieneLocal1) {
        this.tieneLocal1 = tieneLocal1;
    }

    public List<DetalleReserva> getDetalleReservas() {
        if ( this.detalleReservas == null){
            this.detalleReservas = new ArrayList<>();
        }
        return detalleReservas;
    }

    public void setDetalleReservas(List<DetalleReserva> detalleReservas) {
        this.detalleReservas = detalleReservas;
    }

}
