package com.br.natanael.site.ServicesImpl;

import com.br.natanael.site.Framework.CrudServiceImpl;
import com.br.natanael.site.Services.CaixaService;
import com.br.natanael.site.model.Caixa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class CaixaServiceImpl extends CrudServiceImpl<Caixa, Integer> implements CaixaService {
    @Override
    public JpaRepository<Caixa, Integer> getRepository() {
        return null;
    }

    @Override
    public List<Caixa> findByNome(String nome) {
        return null;
    }
}
