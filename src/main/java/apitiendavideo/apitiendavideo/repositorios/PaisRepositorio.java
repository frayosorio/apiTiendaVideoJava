package apitiendavideo.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apitiendavideo.apitiendavideo.modelos.Pais;

@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Long> {

}
