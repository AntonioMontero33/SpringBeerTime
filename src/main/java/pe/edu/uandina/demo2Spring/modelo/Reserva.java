package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javassist.expr.NewArray;

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
    @JsonBackReference
    private Usuario tieneUsuario;
    @ManyToOne
    @JoinColumn(name = "tienelocal", referencedColumnName = "codlocal")
    @JsonBackReference
    private Local tieneLocal;
    @OneToMany(mappedBy = "tieneReserva")
    @JsonManagedReference
    private List<DetalleReserva> detalleReservas;

    public Reserva() {
    }

    public Reserva(Long codReserva, Date fechaReserva, boolean estadoReserva, Usuario tieneUsuario, Local tieneLocal, List<DetalleReserva> detalleReservas) {
        this.codReserva = codReserva;
        this.fechaReserva = fechaReserva;
        this.estadoReserva = estadoReserva;
        this.tieneUsuario = tieneUsuario;
        this.tieneLocal = tieneLocal;
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

    public Local getTieneLocal() {
        return tieneLocal;
    }

    public void setTieneLocal(Local tieneLocal) {
        this.tieneLocal = tieneLocal;
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
