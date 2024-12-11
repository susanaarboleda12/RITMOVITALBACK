package com.example.ServidorSura5.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String presentacion;
    private Double dosis;
    private String laboratorio;
    private LocalDate fechaCaducidad;
    private String contraindicaciones;
    private String registro;
    private Boolean tieneCopago;


    @ManyToOne
    @JoinColumn(name ="fk_paciente", referencedColumnName = "id")
    @JsonBackReference
    private Paciente paciente;


    public Medicamento() {
    }

    public Medicamento(Long id, String nombre, String presentacion, Double dosis, String laboratorio, LocalDate fechaCaducidad, String contraindicaciones, String registro, Boolean tieneCopago) {
        this.id = id;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
        this.fechaCaducidad = fechaCaducidad;
        this.contraindicaciones = contraindicaciones;
        this.registro = registro;
        this.tieneCopago = tieneCopago;
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

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getDosis() {
        return dosis;
    }

    public void setDosis(Double dosis) {
        this.dosis = dosis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Boolean getTieneCopago() {
        return tieneCopago;
    }

    public void setTieneCopago(Boolean tieneCopago) {
        this.tieneCopago = tieneCopago;
    }
}
