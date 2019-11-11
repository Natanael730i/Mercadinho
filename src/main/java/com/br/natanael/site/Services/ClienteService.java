package com.br.natanael.site.Services;

import com.br.natanael.site.Framework.CrudService;
import com.br.natanael.site.model.Cliente;

import java.util.List;

public interface ClienteService extends CrudService<Cliente, Integer> {

    List<Cliente> findByNome(String nome);

}
