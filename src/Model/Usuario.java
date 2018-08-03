package Model;

import java.util.Date;

public class Usuario {

    public Usuario(final int id, final String correo, final Date fechaDeCreacion) {
        this.id = id;
        this.correo = correo;
        this.fechaDeCreacion = fechaDeCreacion;
    }


    public int obtenerId(){
        return id;
    }

    public String obtenerCorreo(){
        return correo;
    }

    public Date obtenerFechaDeCreacion() {
        return (Date) fechaDeCreacion.clone();
    }

    private int id;
    private String correo;
    private Date fechaDeCreacion;
}
