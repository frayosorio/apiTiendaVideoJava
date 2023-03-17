package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import apitiendavideo.apitiendavideo.modelos.Ciudad;

public interface ICiudadServicio {
    
    public List<Ciudad> listar();

    public Ciudad obtener(Long id);

    public List<Ciudad> buscar(String nombre);

    public Ciudad guardar(Ciudad pais);

    public boolean eliminar(Long id);
}
