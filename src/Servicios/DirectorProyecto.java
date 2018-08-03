package Servicios;

import BaseDeDatos.IProyecto;
import Model.Proyecto;

import java.util.List;

public class DirectorProyecto {

    public DirectorProyecto(IProyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void crearProyecto (Proyecto proyecto){
        this.proyecto.crearProyecto(proyecto);
    }

    public List<Proyecto> obtenerProyectos(int idUsuario){
        return proyecto.obtenerProyectosPorUsuario(idUsuario);
    }

    private IProyecto proyecto;
}
