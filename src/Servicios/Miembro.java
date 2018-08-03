package Servicios;

import BaseDeDatos.ITarea;
import Model.Tarea;

import java.util.List;

public class Miembro {

    public Miembro(ITarea tareas) {
        this.tareas = tareas;
    }

    public void añadirTarea(Tarea tarea){
        tareas.crearTarea(tarea);
    }

    public List<Tarea> obtenerListaTareas(int idUsuario){
        return tareas.obtenerTareasPorUsuario(idUsuario);
    }

    public void borrarTarea(Tarea tarea){
        tareas.borrarTarea(tarea);
    }
    private ITarea tareas;

}
