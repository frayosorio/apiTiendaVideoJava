package apitiendavideo.apitiendavideo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apitiendavideo.apitiendavideo.modelos.Pais;
import apitiendavideo.apitiendavideo.servicios.IPaisServicio;

@RestController
@RequestMapping("/paises")
public class PaisControlador {
    
    @Autowired
    private IPaisServicio servicio;


    @RequestMapping(value="/listar", method=RequestMethod.GET)
    public List<Pais> listar(){
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Pais obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

}
