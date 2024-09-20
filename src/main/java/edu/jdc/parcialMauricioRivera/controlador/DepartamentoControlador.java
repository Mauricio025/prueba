package edu.jdc.parcialMauricioRivera.controlador;

import edu.jdc.parcialMauricioRivera.clases.Departamento;
import edu.jdc.parcialMauricioRivera.daos.DepartamentoDao;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class DepartamentoControlador {

    @Autowired(required = true)
    private DepartamentoDao daoDepartamento;

    @GetMapping("/listBrand")
    public String listarDepartamento(Model vista) {
        List<Departamento> arregloDepartamentos = daoDepartamento.consultar("");
        vista.addAttribute("arrDepartamento", arregloDepartamentos);
        return "listarDepartamento";
    }

    @GetMapping("/addBrand")
    public String crearDepartamento(Model vista) {
        vista.addAttribute("objDepartamento", new Departamento());
        return "registrarDepartamento";
    }

    @PostMapping("/addBrand")
    public String registrarDepartamento(@Valid @ModelAttribute Departamento objDepartamento, BindingResult resultado, Model vista, SessionStatus estado) {
        if (resultado.hasErrors()) {
            return "registrarDepartamento";
        } else {
            daoDepartamento.registrar(objDepartamento);
            estado.setComplete();
            return "redirect:/listBrand";
        }
    }
}
