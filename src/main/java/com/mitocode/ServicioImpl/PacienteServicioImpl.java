package com.mitocode.ServicioImpl;

import com.mitocode.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import com.mitocode.repositorio.IPacienteRepositorio;
import com.mitocode.servicio.IPacienteServicio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServicioImpl implements IPacienteServicio {

    @Autowired
    private IPacienteRepositorio repo;

    @Override
    public Paciente registrar(Paciente paciente) throws Exception {
        return repo.save(paciente);
    }

    @Override
    public Paciente modificar(Paciente paciente) throws Exception {
        return repo.save(paciente);
    }

    @Override
    public List<Paciente> listar() throws Exception {
        return repo.findAll();
    }

    @Override
    public Paciente listarPorId(Integer id) throws Exception {
        Optional<Paciente> paciente = repo.findById(id);
        return paciente.isPresent() ? paciente.get() : new Paciente();
    }

    @Override
    public void eliminar(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
