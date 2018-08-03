package BaseDeDatos;

import Model.Proyecto;

import java.util.List;

public interface IProyecto {

    void crearProyecto(Proyecto proyecto);

    List <Proyecto> obtenerProyectosPorUsuario(int usuarioId);
}
