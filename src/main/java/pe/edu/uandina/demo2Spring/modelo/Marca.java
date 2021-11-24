package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codmarca")
    private long codMarca;
    @Column(name="nombremarca")
    private String nombreMarca;
    @OneToMany(mappedBy = "tieneMarca")
    @JsonManagedReference
    private List<Producto> productos;

    public Marca() {
    }

    public Marca(long codMarca, String nombreMarca, List<Producto> productos) {
        this.codMarca = codMarca;
        this.nombreMarca = nombreMarca;
        this.productos = productos;
    }

    public Marca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public long getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(long codMarca) {
        this.codMarca = codMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }
    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
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

