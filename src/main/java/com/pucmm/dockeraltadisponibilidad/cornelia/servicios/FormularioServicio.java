package com.pucmm.dockeraltadisponibilidad.cornelia.servicios;

import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Formulario;
import com.pucmm.dockeraltadisponibilidad.cornelia.repository.FormularioRepository;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.List;
import java.util.Optional;

@Service
public class FormularioServicio {
    private final FormularioRepository formularioRepository;

    public FormularioServicio(FormularioRepository formularioRepository) {
        this.formularioRepository = formularioRepository;
    }

    public Optional<Formulario> getByCodigo(Long codigo) {
        return formularioRepository.findById(codigo);
    }

    public List<Formulario> getAll() {
        return formularioRepository.findAll();
    }

    public Formulario guardar(Formulario formulario) {
        return formularioRepository.save(formulario);
    }
}
