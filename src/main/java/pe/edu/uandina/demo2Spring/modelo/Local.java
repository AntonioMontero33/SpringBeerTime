package pe.edu.uandina.demo2Spring.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="local")
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codlocal")
    private long codLocal ;
    @Column(name="nombrelocal")
    private String nombreLocal ;
    @Column(name="ubicacionlocal")
    private String ubicacionLocal;
    @Column(name="ruclocal")
    private String ruclocal;
    @Column(name="contrasena")
    private String contrasena;
    @OneToMany(mappedBy = "tieneLocal1")
    @JsonManagedReference (value = "jsonLocal1")
    private List<Reserva> reservas;
    @OneToMany(mappedBy = "tieneLocal")
    @JsonManagedReference (value = "jsonLocal" )
    private List<ProductoLocal> productoLocales;

    public Local() {
    }

    public Local(long codLocal, String nombreLocal, String ubicacionLocal, String ruclocal, String contrasena, List<Reserva> reservas, List<ProductoLocal> productoLocales) {
        this.codLocal = codLocal;
        this.nombreLocal = nombreLocal;
        this.ubicacionLocal = ubicacionLocal;
        this.ruclocal = ruclocal;
        this.contrasena = contrasena;
        this.reservas = reservas;
        this.productoLocales = productoLocales;
    }

    public long getCodLocal() {
        return codLocal;
    }

    public void setCodLocal(long codLocal) {
        this.codLocal = codLocal;
    }
    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getUbicacionLocal() {
        return ubicacionLocal;
    }

    public void setUbicacionLocal(String ubicacionLocal) {
        this.ubicacionLocal = ubicacionLocal;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<Reserva> getReservas() {
        if(this.reservas == null){
            this.reservas = new ArrayList<>();
        }
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
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

    public String getRuclocal() {
        return ruclocal;
    }

    public void setRuclocal(String ruclocal) {
        this.ruclocal = ruclocal;
    }
}

