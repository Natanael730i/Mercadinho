package com.br.natanael.site.Controller;

import com.br.natanael.site.Framework.CrudRestController;
import com.br.natanael.site.Framework.CrudService;
import com.br.natanael.site.Services.ProdutosService;
import com.br.natanael.site.model.Caixa;
import com.br.natanael.site.model.Fornecedores;
import com.br.natanael.site.model.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("produtos")
public class ProdutosController  extends CrudRestController<Caixa, Integer> {

    @Autowired
    ProdutosService produtosService;

    @GetMapping("lista-produtos-nome")
    public String findByNome(@RequestParam("nome")String nome, Model model){
        model.addAttribute("lista-produtos", produtosService.findByNome(nome));
        return "lista-produtos-nome";
    }

    @GetMapping("lista-produtos-id")
    public String findById(@RequestParam("nome")Integer id, Model model){
        model.addAttribute("lista-produtos-id", produtosService.findOne(id));
        return "lista-produtos-id";
    }

    @GetMapping("list-produtos-fornecedore")
    public String findByForcedores(@RequestParam("fornecedores") Fornecedores fornecedores, Model model){
        model.addAttribute("lista-produtos-fornecedores", produtosService.findByFornecedores(fornecedores));
        return "lista-produtos-fornecedores";
    }
    @GetMapping("list-produtos-data-compra")
    public String findByDataCompra(@RequestParam("data-compra") LocalDate dataCompra, Model model){
        model.addAttribute("lista-produtos-data-compra", produtosService.findByDataCompra(dataCompra));
        return "lista-produtos-data-compra";
    }

    @Override
    public CrudService<Caixa, Integer> getService() {
        return null;
    }
}
