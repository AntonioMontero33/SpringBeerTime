package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "detallereserva")
public class DetalleReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="coddetallereserva")
    private Long codDetalleReserva;
    @Column(name="cantidaddetallereserva")
    private Integer cantidadDetalleReserva;
    @ManyToOne
    @JoinColumn(name = "tieneproductolocal", referencedColumnName = "codproductolocal")
    @JsonBackReference
    private ProductoLocal tieneProductoLocal;
    @ManyToOne
    @JoinColumn(name = "tienereserva", referencedColumnName = "codreserva")
    @JsonBackReference
    private Reserva tieneReserva;


    public DetalleReserva() {}

    public DetalleReserva(Long codDetalleReserva, Integer cantidadDetalleReserva, ProductoLocal tieneProductoLocal, Reserva tieneReserva) {
        this.codDetalleReserva = codDetalleReserva;
        this.cantidadDetalleReserva = cantidadDetalleReserva;
        this.tieneProductoLocal = tieneProductoLocal;
        this.tieneReserva = tieneReserva;
    }

    public Long getCodDetalleReserva() {
        return codDetalleReserva;
    }

    public void setCodDetalleReserva(Long codDetalleReserva) {
        this.codDetalleReserva = codDetalleReserva;
    }

    public Integer getCantidadDetalleReserva() {
        return cantidadDetalleReserva;
    }

    public void setCantidadDetalleReserva(Integer cantidadDetalleReserva) {
        this.cantidadDetalleReserva = cantidadDetalleReserva;
    }

    public ProductoLocal getTieneProductoLocal() {
        return tieneProductoLocal;
    }

    public void setTieneProductoLocal(ProductoLocal tieneProductoLocal) {
        this.tieneProductoLocal = tieneProductoLocal;
    }

    public Reserva getTieneReserva() {
        return tieneReserva;
    }

    public void setTieneReserva(Reserva tieneReserva) {
        this.tieneReserva = tieneReserva;
    }
}
