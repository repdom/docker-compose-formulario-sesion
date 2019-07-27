package com.pucmm.dockeraltadisponibilidad.cornelia.repository;

import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<Usuario, String> {
    public Usuario findByUsuario(String usuario);
}
