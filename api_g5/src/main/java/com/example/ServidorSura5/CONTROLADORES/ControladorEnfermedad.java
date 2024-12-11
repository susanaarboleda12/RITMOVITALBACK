package com.example.ServidorSura5.CONTROLADORES;

import com.example.ServidorSura5.MODELOS.Enfermedad;
import com.example.ServidorSura5.MODELOS.Medicamento;
import com.example.ServidorSura5.SERVICIOS.ServicioEnfermedad;
import com.example.ServidorSura5.SERVICIOS.ServicioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enfermedad")
public class ControladorEnfermedad {

    @Autowired
    ServicioEnfermedad servicioEnfermedad;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Enfermedad datos){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioEnfermedad.guardarEnfermedad(datos));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> obtener(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioEnfermedad.buscarEnfermedad());

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

}
