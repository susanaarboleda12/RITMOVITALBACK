package com.example.ServidorSura5.MODELOS;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="medico")

public class Medico {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombres; // 35 caracteres y solo letras
    private String matriculaProfesional; // 20 caracteres
    private String especialidad; //20 caracteres
    private Double salario; //solo positivos,menos de 10 millones y maximo 20
    private String ips; // 50 caracteres
    private String correo; // @sura.com.co
    private String telefono; //12 caracteres
    private String direccionConsultorio; // 50 caracteres
    private Boolean disponibleFindesemana;

    //Creando una relacion con la clase paciente
    //Me relaciono con muchos pacientes
    @OneToMany(mappedBy = "medico" )
    @JsonManagedReference
    private List<Paciente> pacientes;

    public Medico() {
    }

    public Medico(Long id, String nombres, String matriculaProfesional, String especialidad, Double salario, String ips, String correo, String telefono, String direccionConsultorio, Boolean disponibleFindesemana) {
        this.id = id;
        this.nombres = nombres;
        this.matriculaProfesional = matriculaProfesional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccionConsultorio = direccionConsultorio;
        this.disponibleFindesemana = disponibleFindesemana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionConsultorio() {
        return direccionConsultorio;
    }

    public void setDireccionConsultorio(String direccionConsultorio) {
        this.direccionConsultorio = direccionConsultorio;
    }

    public Boolean getDisponibleFindesemana() {
        return disponibleFindesemana;
    }

    public void setDisponibleFindesemana(Boolean disponibleFindesemana) {
        this.disponibleFindesemana = disponibleFindesemana;
    }
}
