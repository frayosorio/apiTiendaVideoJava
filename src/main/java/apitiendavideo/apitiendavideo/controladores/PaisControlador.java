package apitiendavideo.apitiendavideo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Pais> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Pais obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Pais> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Pais crear(@RequestBody Pais pais) {
        return servicio.guardar(pais);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Pais actualizar(@RequestBody Pais pais) {
        if (servicio.obtener(pais.getId()) != null) {
            return servicio.guardar(pais);
        } else {
            return null;
        }
    }

}
