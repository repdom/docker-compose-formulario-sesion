package com.pucmm.dockeraltadisponibilidad.cornelia.controladores;

import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Formulario;
import com.pucmm.dockeraltadisponibilidad.cornelia.entidades.Usuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.seguridad.CurrentUsuario;
import com.pucmm.dockeraltadisponibilidad.cornelia.seguridad.UsuarioPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(@CurrentUsuario UsuarioPrincipal currentUser) {
        ModelAndView modelAndView = new ModelAndView();

        if (currentUser == null) {
            Usuario user = new Usuario();
            modelAndView.addObject("usuario", user);
            modelAndView.setViewName("index");
        } else {
            modelAndView.setViewName("formulario");
            modelAndView.addObject("usuario", currentUser);
            Formulario form = new Formulario();
            modelAndView.addObject("formulario", form);
        }
        return modelAndView;
    }
}
