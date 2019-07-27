package com.pucmm.dockeraltadisponibilidad.cornelia.controladores;

import com.pucmm.dockeraltadisponibilidad.cornelia.entidadPublica;
import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Formulario;
import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Usuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.seguridad.CurrentUsuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.seguridad.UsuarioPrincipal;
import com.pucmm.dockeraltadisponibilidad.cornelia.servicios.FormularioServicio;
import com.pucmm.dockeraltadisponibilidad.cornelia.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class FormularioController {
    @Autowired
    FormularioServicio formularioServicio;

    @Autowired
    UsuarioServicio usuarioServicio;

    /*@RequestMapping("")
    public ModelAndView indice(@CurrentUsuario UsuarioPrincipal, ModelAndView model) {

    }*/

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submit(@Valid entidadPublica entidadPublica, @CurrentUsuario UsuarioPrincipal usuarioPrincipal) {
        Usuario usuario = usuarioServicio.getUsuario(usuarioPrincipal.getUsername()).orElse(null);
        if(usuario.getUsuario() != null) {
            return "redirect:/";
        }

        Formulario formulario = new Formulario();
        formulario.setPregunta1(entidadPublica.pregunta1);
        formulario.setResultado1(entidadPublica.resultado1);
        formulario.setPregunta2(entidadPublica.pregunta2);
        formulario.setResultado2(entidadPublica.resultado2);
        formulario.setPregunta3(entidadPublica.pregunta3);
        formulario.setPregunta4(entidadPublica.pregunta4);
        formulario.setPregunta5(entidadPublica.pregunta5);
        formulario.setResultado3(entidadPublica.resultado3);
        formulario.setResultado4(entidadPublica.resultado4);
        formulario.setResultado5(entidadPublica.resultado5);

        formularioServicio.guardar(formulario);

        return "redirect:/";
    }
}
