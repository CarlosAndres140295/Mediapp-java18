package com.mitocode.repositorio;

import com.mitocode.modelo.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepositorio extends JpaRepository<Paciente, Integer> {


}
