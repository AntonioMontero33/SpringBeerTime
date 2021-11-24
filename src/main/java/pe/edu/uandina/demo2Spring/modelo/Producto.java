package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codproducto")
    private Long codProducto;
    @Column(name = "nombreproducto")
    private String nombreProducto;
    @Column(name = "mililitrosproducto")
    private Integer mililitrosProducto;
    @Column(name = "descripcionproducto")
    private String descripcionProducto;
    @Column(name = "volalcoholproducto")
    private Integer volalcoholProducto;
    @Column(name = "imagenproducto")
    private String imagenProducto;
    @ManyToOne
    @JoinColumn(name = "tienemarca", referencedColumnName = "codmarca")
    @JsonBackReference (value = "jsonMarca")
    private Marca tieneMarca;
    @ManyToOne
    @JoinColumn(name = "tienecategoria", referencedColumnName = "codcategoria")
    @JsonBackReference (value = "jsonCategoria")
    private Categoria tieneCategoria;
    @OneToMany(mappedBy = "tieneProducto")
    @JsonManagedReference (value = "jsonProducto")
    private List<ProductoLocal> productoLocales;

    public Producto() {
    }

    public Producto(Long codProducto, String nombreProducto, Integer mililitrosProducto, String descripcionProducto, Integer volalcoholProducto, String imagenProducto, Marca tieneMarca, Categoria tieneCategoria, List<ProductoLocal> productoLocales) {
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.mililitrosProducto = mililitrosProducto;
        this.descripcionProducto = descripcionProducto;
        this.volalcoholProducto = volalcoholProducto;
        this.imagenProducto = imagenProducto;
        this.tieneMarca = tieneMarca;
        this.tieneCategoria = tieneCategoria;
        this.productoLocales = productoLocales;
    }

    public Long getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Long codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public long getMililitrosProducto() {
        return mililitrosProducto;
    }

    public void setMililitrosProducto(Integer mililitrosProducto) {
        this.mililitrosProducto = mililitrosProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public long getVolalcoholProducto() {
        return volalcoholProducto;
    }

    public void setVolalcoholProducto(Integer volalcoholProducto) {
        this.volalcoholProducto = volalcoholProducto;
    }

    public String getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(String imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public Marca getTieneMarca() {
        return tieneMarca;
    }

    public void setTieneMarca(Marca tieneMarca) {
        this.tieneMarca = tieneMarca;
    }

    public Categoria getTieneCategoria() {
        return tieneCategoria;
    }

    public void setTieneCategoria(Categoria tieneCategoria) {
        this.tieneCategoria = tieneCategoria;
    }

    public List<ProductoLocal> getProductoLocales() {
        if(this.productoLocales == null){
            this.productoLocales = new ArrayList<>();
        }
        return productoLocales;
    }

    public void setProductoLocales(List<ProductoLocal> productoLocales) {
        this.productoLocales = productoLocales;
    }


}
