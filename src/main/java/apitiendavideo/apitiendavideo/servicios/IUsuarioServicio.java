package apitiendavideo.apitiendavideo.servicios;

import apitiendavideo.apitiendavideo.modelos.Usuario;

public interface IUsuarioServicio {

    public Usuario login(String nombreUsuario, String clave);

}
