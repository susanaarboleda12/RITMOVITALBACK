package com.example.ServidorSura5.SERVICIOS;


import com.example.ServidorSura5.MODELOS.Enfermedad;
import com.example.ServidorSura5.MODELOS.Medicamento;
import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioEnfermedad;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEnfermedad {

    //1. Llamar al repositorio respectivo
    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    //2. Se programan las funciones para las distintas operaciones en la BD

    //3. Funcion para guardar datos
    public Enfermedad guardarEnfermedad(Enfermedad datosEnfermedad) throws Exception {
        try {
            return iRepositorioEnfermedad.save(datosEnfermedad);

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Enfermedad> buscarEnfermedad()throws Exception{
        try {
            return iRepositorioEnfermedad.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}


