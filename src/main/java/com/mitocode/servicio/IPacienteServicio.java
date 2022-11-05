package com.mitocode.servicio;

import com.mitocode.modelo.Paciente;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPacienteServicio {

    Paciente registrar(Paciente paciente) throws Exception;
    Paciente modificar(Paciente paciente) throws Exception;
    List<Paciente> listar() throws Exception;
    Paciente listarPorId(Integer id) throws Exception;
    void eliminar(Integer id) throws Exception;

}
