package pe.edu.uandina.demo2Spring.modelo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codusuario")
    private long codUsuario;
    @Column(name = "dniusuario")
    private String dniUsuario;
    @Column(name = "nombreusuario")
    private String NombreUsuario;
    @Column(name = "apellidousuario")
    private String ApellidoUsuario;
    @Column(name = "usuario")
    private String Usuario;
    @Column(name = "contrasena")
    private String Contrasena;
    @Column(name = "celular")
    private String Celular;
    @Column(name = "correo")
    private String Correo;
    @Column(name = "direccion")
    private String Direccion;
    @OneToMany(mappedBy = "tieneUsuario")
    private List<Reserva> reservas;

    public Usuario() {
    }

    public Usuario(long codUsuario, String dniUsuario, String nombreUsuario, String apellidoUsuario, String usuario, String contrasena, String celular, String correo, String direccion, List<Reserva> reservas) {
        this.codUsuario = codUsuario;
        this.dniUsuario = dniUsuario;
        NombreUsuario = nombreUsuario;
        ApellidoUsuario = apellidoUsuario;
        Usuario = usuario;
        Contrasena = contrasena;
        Celular = celular;
        Correo = correo;
        Direccion = direccion;
        this.reservas = reservas;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return ApellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        ApellidoUsuario = apellidoUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public long getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(long codUsuario) {
        this.codUsuario = codUsuario;
    }

    public List<Reserva> getReservas() {
        if (this.reservas == null){
            this.reservas = new ArrayList<>();
        }
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}

