package com.mitocode.controlador;

import com.mitocode.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mitocode.servicio.IPacienteServicio;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {

    @Autowired
    private IPacienteServicio servicio;

    @GetMapping
    public List<Paciente> listar() throws Exception{
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public Paciente listarPorId(@PathVariable Integer id) throws Exception{
        return servicio.listarPorId(id);
    }

    @PostMapping
    public Paciente registrar(@RequestBody  Paciente paciente) throws Exception{
        return servicio.registrar(paciente);
    }

    @PutMapping("/{id}")
    public Paciente modificar(@PathVariable Integer id, @RequestBody Paciente paciente) throws Exception{
        Paciente response = servicio.listarPorId(paciente.getIdPaciente());
        if(response != null){
            paciente.setIdPaciente(id);
            return servicio.modificar(paciente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) throws Exception{
        servicio.eliminar(id);
    }

}
