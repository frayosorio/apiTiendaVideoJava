package apitiendavideo.apitiendavideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.modelos.Empresa;
import apitiendavideo.apitiendavideo.repositorios.EmpresaRepositorio;

@Service
public class EmpresaServicio implements IEmpresaServicio {

    @Autowired
    private EmpresaRepositorio repositorio;

    @Override
    public List<Empresa> listar() {
        return repositorio.findAll();
    }

    @Override
    public Empresa obtener(Long id) {
        return repositorio.findById(id).get();
    }

}
