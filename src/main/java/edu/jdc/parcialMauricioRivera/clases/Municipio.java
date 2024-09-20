package edu.jdc.parcialMauricioRivera.clases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Objects;


public class Municipio {

    
    private Integer codMunicipio;
   
    private String nombreMunicipio;

 
    private Integer cantidadHabitantes;
    
    private Departamento codDepartamento;

    public Municipio() {
    }

    public Municipio(Integer codMunicipio, String nombreMunicipio, Integer cantidadHabitantes, Departamento codDepartamento) {
        this.codMunicipio = codMunicipio;
        this.nombreMunicipio = nombreMunicipio;
        this.cantidadHabitantes = cantidadHabitantes;
        this.codDepartamento = codDepartamento;
    }

    public Integer getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(Integer codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public Integer getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public void setCantidadHabitantes(Integer cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public Departamento getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(Departamento codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codMunicipio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Municipio other = (Municipio) obj;
        return Objects.equals(this.codMunicipio, other.codMunicipio);
    }

    @Override
    public String toString() {
        return "Municipio{" + "codMunicipio=" + codMunicipio + ", nombreMunicipio=" + nombreMunicipio + ", cantidadHabitantes=" + cantidadHabitantes + ", codDepartamento=" + codDepartamento + '}';
    }

}
