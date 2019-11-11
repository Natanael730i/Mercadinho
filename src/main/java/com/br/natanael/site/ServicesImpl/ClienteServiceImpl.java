package com.br.natanael.site.ServicesImpl;

import com.br.natanael.site.Framework.CrudServiceImpl;
import com.br.natanael.site.Services.ClienteService;
import com.br.natanael.site.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl extends CrudServiceImpl<Cliente, Integer> implements ClienteService {
    @Override
    public List<Cliente> findByNome(String nome) {
        return null;
    }

    @Override
    public JpaRepository<Cliente, Integer> getRepository() {
        return null;
    }
}
