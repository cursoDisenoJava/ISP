package Model;

import java.util.Date;

public class Proyecto {

    public Proyecto(int id, String nombre, Date fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
    }

    public int obtenerId(){
        return id;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public Date obtenerFechaInicio(){
        return (Date) fechaInicio.clone();
    }

    private int id;
    private String nombre;
    private Date fechaInicio;
}
