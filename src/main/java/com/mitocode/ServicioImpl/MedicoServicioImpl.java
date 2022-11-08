package com.mitocode.ServicioImpl;

import com.mitocode.modelo.Medico;
import com.mitocode.repositorio.IGenericoRepositorio;
import com.mitocode.repositorio.IMedicoRepositorio;
import com.mitocode.servicio.IMedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoServicioImpl extends CRUDImpl<Medico, Integer> implements IMedicoServicio {

    @Autowired
    private IMedicoRepositorio repo;

    @Override
    protected IGenericoRepositorio<Medico, Integer> getRepo() {
        return repo;
    }
}
