package apitiendavideo.apitiendavideo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo.apitiendavideo.modelos.Ciudad;
import apitiendavideo.apitiendavideo.servicios.ICiudadServicio;

@RestController
@RequestMapping("/ciudades")
public class CiudadControlador {
    
    @Autowired
    private ICiudadServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Ciudad> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Ciudad obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Ciudad> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }

}
