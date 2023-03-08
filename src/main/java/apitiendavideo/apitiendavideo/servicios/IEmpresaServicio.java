package apitiendavideo.apitiendavideo.servicios;

import java.util.List;
import apitiendavideo.apitiendavideo.modelos.Empresa;

public interface IEmpresaServicio {

    public List<Empresa> listar();

    public Empresa obtener(Long id);

}
