package apitiendavideo.apitiendavideo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo.apitiendavideo.modelos.Usuario;
import apitiendavideo.apitiendavideo.servicios.IUsuarioServicio;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    private IUsuarioServicio servicio;

    @GetMapping("/login")
    public Usuario login(@RequestParam("usuario") String nombreUsuario, @RequestParam("clave") String clave) {
        return servicio.login(nombreUsuario, clave);
    }

}
