package Model;

public class Tarea {


    public Tarea(int id, String nombre, int estimacionDificultad) {
        this.id = id;
        this.nombre = nombre;
        this.estimacionDificultad = estimacionDificultad;
        this.hecho = false;
    }
    public int obtenerId(){
        return id;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public int obtenerEstimacionDificultad(){
        return estimacionDificultad;
    }

    public void tareaCompletada(){
        hecho = true;
    }

    public boolean estaHechaLaTarea(){
        return hecho;
    }

    private int id;
    private String nombre;
    private int estimacionDificultad;
    private boolean hecho;
}
