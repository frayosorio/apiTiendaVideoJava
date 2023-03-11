package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.modelos.Ciudad;
import apitiendavideo.apitiendavideo.repositorios.CiudadRepositorio;

@Service
public class CiudadServicio implements ICiudadServicio {
    
    @Autowired
    private CiudadRepositorio repositorio;

    @Override
    public List<Ciudad> listar() {
        return repositorio.findAll();
    }

    @Override
    public Ciudad obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Ciudad> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

}
