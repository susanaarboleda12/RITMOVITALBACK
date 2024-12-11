package com.example.ServidorSura5.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="enfermedad")
public class Enfermedad {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String sintomas;
    private String clasificacion;
    private String grado;
    private Double probabilidadVida;


    @ManyToOne
    @JoinColumn(name ="fk_paciente", referencedColumnName = "id")
    @JsonBackReference
    private Paciente paciente;

    
    public Enfermedad() {
    }

    public Enfermedad(Long id, String nombre, String sintomas, String clasificacion, String grado, Double probabilidadVida) {
        this.id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.clasificacion = clasificacion;
        this.grado = grado;
        this.probabilidadVida = probabilidadVida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Double getProbabilidadVida() {
        return probabilidadVida;
    }

    public void setProbabilidadVida(Double probabilidadVida) {
        this.probabilidadVida = probabilidadVida;
    }
}
