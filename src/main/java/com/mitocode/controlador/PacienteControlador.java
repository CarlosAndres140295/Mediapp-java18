package com.mitocode.controlador;

import com.mitocode.dto.PacienteDTO;
import com.mitocode.exception.ModeloNotFoundException;
import com.mitocode.modelo.Paciente;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mitocode.servicio.IPacienteServicio;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {

    @Autowired
    private IPacienteServicio servicio;

    @Autowired
    private ModelMapper modelMapper;



    @GetMapping
    public ResponseEntity<List<PacienteDTO>> listar() throws Exception{
        List<PacienteDTO> pacientes = servicio.listar().stream().map(paciente -> modelMapper.map(paciente, PacienteDTO.class)).collect(Collectors.toList());
        return new ResponseEntity<>(pacientes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteDTO> listarPorId(@PathVariable Integer id) throws Exception{
        Paciente paciente = servicio.listarPorId(id);
        if(paciente == null){
            throw new ModeloNotFoundException("PACIENTE NO ENCONTRADO");
        }
        PacienteDTO pacienteDTO = modelMapper.map(paciente, PacienteDTO.class);
        return new ResponseEntity<>(pacienteDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PacienteDTO> registrar(@Valid @RequestBody  PacienteDTO dtoRequest) throws Exception{
        Paciente newPaciente = modelMapper.map(dtoRequest, Paciente.class);
        Paciente response = servicio.registrar(newPaciente);
        PacienteDTO dtoResponse = modelMapper.map(response, PacienteDTO.class);
        return new ResponseEntity<>(dtoResponse, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<PacienteDTO> modificar(@Valid @RequestBody PacienteDTO dtoRequest) throws Exception{
        Paciente paciente = servicio.listarPorId(dtoRequest.getIdPaciente());
        if(paciente == null){
            throw new ModeloNotFoundException("PACIENTE NO ENCONTRADO");
        }
        Paciente pacienteRequest = modelMapper.map(dtoRequest, Paciente.class);
        Paciente pacienteResponse = servicio.registrar(pacienteRequest);
        PacienteDTO dtoResponse = modelMapper.map(pacienteResponse, PacienteDTO.class);
        return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) throws Exception{
        servicio.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
