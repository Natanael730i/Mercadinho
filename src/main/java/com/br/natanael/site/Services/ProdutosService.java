package com.br.natanael.site.Services;

import com.br.natanael.site.Framework.CrudService;
import com.br.natanael.site.model.Fornecedores;
import com.br.natanael.site.model.Produtos;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public interface ProdutosService extends CrudService<Produtos, Integer> {

    List<Produtos> findByNome(String nome);

    List<Produtos> findByTipo(String Tipo);

    List<Produtos> findByDataCompra(LocalDate dataCompra);

    List<Produtos> findByFornecedores(Fornecedores fornecedores);

    Produtos save(Produtos produtos);
}
