package com.mitocode.ServicioImpl;

import com.mitocode.modelo.Paciente;
import com.mitocode.repositorio.IGenericoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import com.mitocode.repositorio.IPacienteRepositorio;
import com.mitocode.servicio.IPacienteServicio;
import org.springframework.stereotype.Service;

@Service
public class PacienteServicioImpl extends CRUDImpl<Paciente, Integer> implements IPacienteServicio {

    @Autowired
    private IPacienteRepositorio repo;


    @Override
    protected IGenericoRepositorio<Paciente, Integer> getRepo() {
        return repo;
    }
}
