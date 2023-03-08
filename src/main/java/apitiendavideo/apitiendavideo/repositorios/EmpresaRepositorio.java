package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Empresa;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, Long> {
    
}
