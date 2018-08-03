package Servicios;

import BaseDeDatos.IUsuario;
import Model.Usuario;

import java.util.List;


public class Administrador {

    public Administrador(IUsuario usuario) {
        this.usuario = usuario;
    }

    public void guardarUsuario(Usuario usuario){
        this.usuario.crearUsuario(usuario);
    }

    public List<Usuario> obtenerUsuarios(){
        return usuario.obtenerUsuarios();
    }

    public void borrarUsuario(Usuario usuario){
        this.usuario.borrarUsuario(usuario);
    }

    private IUsuario usuario;
}
