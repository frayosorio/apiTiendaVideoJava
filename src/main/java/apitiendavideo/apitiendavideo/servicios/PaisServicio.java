package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.modelos.Pais;
import apitiendavideo.apitiendavideo.repositorios.PaisRepositorio;

@Service
public class PaisServicio implements IPaisServicio {

    @Autowired
    PaisRepositorio repositorio;

    @Override
    public List<Pais> listar() {
        return repositorio.findAll();
    }

    @Override
    public Pais obtener(Long id) {
        var pais = repositorio.findById(id);
        return pais.isEmpty() ? null : pais.get();
    }

    @Override
    public List<Pais> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Pais guardar(Pais pais) {
        return repositorio.save(pais);
    }

    @Override
    public boolean elimininar(Long id) {
        repositorio.deleteById(id);
        return true;
    }
}
