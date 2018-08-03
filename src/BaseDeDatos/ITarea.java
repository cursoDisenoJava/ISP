package BaseDeDatos;

import Model.Tarea;

import java.util.List;

public interface ITarea {

    void crearTarea(Tarea tarea);

    List<Tarea> obtenerTareasPorUsuario(int usuarioId);

    void borrarTarea(Tarea tarea);
}
