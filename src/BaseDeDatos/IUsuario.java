package BaseDeDatos;

import Model.Usuario;

import java.util.List;

public interface IUsuario {

    void crearUsuario(Usuario usuario);

    List<Usuario> obtenerUsuarios ();

    void borrarUsuario(Usuario usuario);
}
