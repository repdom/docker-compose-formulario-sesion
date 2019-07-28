package com.pucmm.dockeraltadisponibilidad.cornelia.controladores;

import com.pucmm.dockeraltadisponibilidad.cornelia.entidadPublica;
import com.pucmm.dockeraltadisponibilidad.cornelia.seguridad.CurrentUsuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.seguridad.UsuarioPrincipal;
import com.pucmm.dockeraltadisponibilidad.cornelia.servicios.FormularioServicio;
import com.pucmm.dockeraltadisponibilidad.cornelia.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GraficoController {
    @Autowired
    FormularioServicio formularioServicio;

    @Autowired
    UsuarioServicio usuarioServicio;

    @RequestMapping("graficos")
    public ModelAndView indice(@CurrentUsuario UsuarioPrincipal usuarioPrincipal, ModelAndView model) {
        // entidadPublica entidadPublica = new entidadPublica();

        if(usuarioPrincipal == null) {
            model.setViewName("index");
            return model;
        } else if (!usuarioPrincipal.getUsername().equals("repdom")) {
            model.setViewName("index");
            return model;
        }

        model.addObject("pregunta1", formularioServicio.contarResultado1());
        model.addObject("pregunta2", formularioServicio.contarResultado2());
        model.addObject("pregunta3", formularioServicio.contarResultado3());
        model.addObject("pregunta4", formularioServicio.contarResultado4());
        // model.addObject("usuario", usuarioPrincipal);
        model.setViewName("graficos");

        return model;
    }

}
