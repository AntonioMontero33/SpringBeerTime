package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "productolocal")
public class ProductoLocal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codproductolocal")
    private Long codProductoLocal;
    @Column(name = "precioproductolocal")
    private Long precioProductoLocal;
    @OneToMany(mappedBy = "tieneProductoLocal")
    @JsonManagedReference(value = "jsonProductoLocal")
    private List<DetalleReserva> detalleReservas;
    @ManyToOne
    @JoinColumn(name = "tieneproducto", referencedColumnName = "codproducto")
    @JsonBackReference (value = "jsonProducto")
    private Producto tieneProducto;
    @ManyToOne
    @JoinColumn(name = "tienelocal", referencedColumnName = "codlocal")
    @JsonBackReference (value = "jsonLocal")
    private Local tieneLocal;


    public ProductoLocal() {
    }

    public ProductoLocal(Long codProductoLocal, Long precioProductoLocal, List<DetalleReserva> detalleReservas, Producto tieneProducto, Local tieneLocal) {
        this.codProductoLocal = codProductoLocal;
        this.precioProductoLocal = precioProductoLocal;
        this.detalleReservas = detalleReservas;
        this.tieneProducto = tieneProducto;
        this.tieneLocal = tieneLocal;
    }

    public Long getCodProductoLocal() {
        return codProductoLocal;
    }

    public void setCodProductoLocal(Long codProductoLocal) {
        this.codProductoLocal = codProductoLocal;
    }

    public long getPrecioProductoLocal() {
        return precioProductoLocal;
    }

    public void setPrecioProductoLocal(Long precioProductoLocal) {
        this.precioProductoLocal = precioProductoLocal;
    }

    public List<DetalleReserva> getDetalleReservas() {
        if(this.detalleReservas == null){
            this.detalleReservas = new ArrayList<>();
        }
        return detalleReservas;
    }

    public void setDetalleReservas(List<DetalleReserva> detalleReservas) {
        this.detalleReservas = detalleReservas;
    }

    public Producto getTieneProducto() {
        return tieneProducto;
    }

    public void setTieneProducto(Producto tieneProducto) {
        this.tieneProducto = tieneProducto;
    }

    public Local getTieneLocal() {
        return tieneLocal;
    }

    public void setTieneLocal(Local tieneLocal) {
        this.tieneLocal = tieneLocal;
    }
}
