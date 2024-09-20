package edu.jdc.parcialMauricioRivera.daos;

import edu.jdc.parcialMauricioRivera.Interfaces.Operacion;
import edu.jdc.parcialMauricioRivera.clases.Departamento;
import edu.jdc.parcialMauricioRivera.repositorios.DepartamentoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoDao implements Operacion<Departamento> {

    @Autowired
    private DepartamentoRepositorio repoDepartamento;

    @Override
    public List<Departamento> consultar(String oden) {
        return (List< Departamento>) repoDepartamento.findAll();
    }

    @Override
    public Boolean registrar(Departamento objRegistrar) {
        return repoDepartamento.save(objRegistrar) != null;
    }

    @Override
    public Integer cantidaRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
