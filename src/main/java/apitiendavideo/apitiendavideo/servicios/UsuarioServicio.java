package apitiendavideo.apitiendavideo.servicios;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import apitiendavideo.apitiendavideo.interfaces.IUsuarioServicio;
import apitiendavideo.apitiendavideo.modelos.Usuario;
import apitiendavideo.apitiendavideo.seguridad.FiltroSeguridad;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class UsuarioServicio implements IUsuarioServicio {

    @Override
    public Usuario login(String nombreUsuario, String clave) {
        Usuario usuario = new Usuario(); // se debe cambiar por validacion en la bd
        usuario.setUsuario(nombreUsuario);

        String token = obtenerJWTToken(nombreUsuario);
        
        usuario.setToken(token);
        return usuario;
    }

    private String obtenerJWTToken(String nombreUsuario) {

        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("tiendavideo")
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 300000))
                .signWith(SignatureAlgorithm.HS512, FiltroSeguridad.SECRETO.getBytes())
                .compact();

        return "Bearer " + token;
    }

}
