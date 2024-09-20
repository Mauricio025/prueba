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

@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_departamento")
    private Integer codDepartamento;

    @NotNull
    @Size(min = 5, max = 250)
    @Column(name = "nombre_departamento")
    private String nombreDepartamento;

    @NotNull
    @Column(name = "area_departamento")
    private Double areaDepartamento;

    @NotNull
    @Column(name = "clima_departamento  ")
    private Boolean climaDepartamento;

    public Departamento() {
    }

    public Departamento(Integer codDepartamento, String nombreDepartamento, Double areaDepartamento, Boolean climaDepartamento) {
        this.codDepartamento = codDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.areaDepartamento = areaDepartamento;
        this.climaDepartamento = climaDepartamento;
        System.out.println("hoa");
    }

    public Integer getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(Integer codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Double getAreaDepartamento() {
        return areaDepartamento;
    }

    public void setAreaDepartamento(Double areaDepartamento) {
        this.areaDepartamento = areaDepartamento;
    }

    public Boolean getClimaDepartamento() {
        return climaDepartamento;
    }

    public void setClimaDepartamento(Boolean climaDepartamento) {
        this.climaDepartamento = climaDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.codDepartamento);
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
        final Departamento other = (Departamento) obj;
        return Objects.equals(this.codDepartamento, other.codDepartamento);
    }

    @Override
    public String toString() {
        return "Departamento{" + "codDepartamento=" + codDepartamento + ", nombreDepartamento=" + nombreDepartamento + ", areaDepartamento=" + areaDepartamento + ", climaDepartamento=" + climaDepartamento + '}';
    }

}
