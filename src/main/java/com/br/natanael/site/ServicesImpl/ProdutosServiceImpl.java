package com.br.natanael.site.ServicesImpl;

import com.br.natanael.site.Framework.CrudServiceImpl;
import com.br.natanael.site.Services.ProdutosService;
import com.br.natanael.site.model.Fornecedores;
import com.br.natanael.site.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public class ProdutosServiceImpl extends CrudServiceImpl<Produtos, Integer> implements ProdutosService {



    @Override
    public JpaRepository<Produtos, Integer> getRepository() {
        return null;
    }

    @Override
    public List<Produtos> findByNome(String nome) {
        return null;
    }

    @Override
    public List<Produtos> findByTipo(String Tipo) {
        return null;
    }

    @Override
    public List<Produtos> findByDataCompra(LocalDate dataCompra) {
        return null;
    }

    @Override
    public List<Produtos> findByFornecedores(Fornecedores fornecedores) {
        return null;
    }

    @Override
    public Produtos save(Produtos entity) {
        return null;
    }
}
