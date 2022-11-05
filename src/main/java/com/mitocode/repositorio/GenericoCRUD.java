package com.mitocode.repositorio;

import com.mitocode.modelo.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericoCRUD extends JpaRepository<Paciente, Integer> {


}
