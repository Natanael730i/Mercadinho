package com.br.natanael.site.Services;

import com.br.natanael.site.Framework.CrudService;
import com.br.natanael.site.model.Caixa;
import com.br.natanael.site.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CaixaService extends CrudService<Caixa, Integer > {


    List<Caixa> findByNome(String nome);

}
