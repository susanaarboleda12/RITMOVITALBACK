package com.example.ServidorSura5.SERVICIOS;


import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioMedico;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioMedico {

    //1. Llamar al repositorio respectivo
    @Autowired
    IRepositorioMedico iRepositorioMedico;

    //2. Se programan las funciones para las distintas operaciones en la BD

    //3. Funcion para guardar datos
    public Medico guardarMedico(Medico datosMedico) throws Exception {
        try {
            return iRepositorioMedico.save(datosMedico);

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Medico> buscarMedico()throws Exception{
        try {
            return iRepositorioMedico.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}


