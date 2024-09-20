package edu.jdc.parcialMauricioRivera.controlador;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class PaginaControlador {

    @GetMapping("/")
    public String paginaPrincipal(Model vista) {
        return "index";
    }

    @GetMapping("/contact")
    public String paginaContacto(Model vista) {
        return "contacto";
    }

    @GetMapping("/aboutMe")
    public String paginaAcercaDe(Model vista) {
        return "acercaDe";
    }

    @GetMapping("/signin")
    public String paginaInicioSesion(Model vista) {
        return "login";
    }
}
