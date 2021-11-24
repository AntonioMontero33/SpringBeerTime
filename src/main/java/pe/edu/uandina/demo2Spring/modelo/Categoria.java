package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codcategoria")
    private Long codCategoria;
    @Column(name="nombrecategoria")
    private String nombreCategoria;
    @OneToMany(mappedBy = "tieneCategoria")
    @JsonManagedReference
    private List<Producto> productos;

    public Categoria(){
    }

    public Categoria(Long codCategoria, String nombreCategoria, List<Producto> productos) {
        this.codCategoria = codCategoria;
        this.nombreCategoria = nombreCategoria;
        this.productos = productos;
    }

    public Long getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Long codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public List<Producto> getProductos() {
        if(this.productos == null){
            this.productos = new ArrayList<>();
        }
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
