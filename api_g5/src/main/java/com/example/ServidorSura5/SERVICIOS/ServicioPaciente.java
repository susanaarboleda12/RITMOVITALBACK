package com.example.ServidorSura5.SERVICIOS;


import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPaciente {

    //1. Llamar al repositorio respectivo
    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    //2. Se programan las funciones para las distintas operaciones en la BD

    //3. Funcion para guardar datos
    public Paciente guardarPaciente(Paciente datosPaciente) throws Exception {
        try {
            return iRepositorioPaciente.save(datosPaciente);

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Paciente> buscarPacientes()throws Exception{
        try {
            return iRepositorioPaciente.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}


