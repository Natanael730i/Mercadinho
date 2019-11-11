package com.br.natanael.site.Controller;

import com.br.natanael.site.Framework.CrudRestController;
import com.br.natanael.site.Framework.CrudService;
import com.br.natanael.site.Services.ComprasService;
import com.br.natanael.site.model.Caixa;
import com.br.natanael.site.model.Cliente;
import com.br.natanael.site.model.Compras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("compras")
public class ComprasController extends CrudRestController<Compras, Integer> {

    @Autowired private ComprasService comprasService;

    @GetMapping
    public String findById(@RequestParam("id")Integer id, Model model){
        model.addAttribute("cliente", ComprasService.findById(id));
        return "compras-encontrar";
    }

    @PostMapping
    public String save(@RequestParam("Compras") Compras compras, Model model){
        model.addAttribute("compras", comprasService.save(compras));
        return "compras";
    }

    @GetMapping
    public String findByClienteId(@RequestParam("cliente-id")Cliente cliente, Model model){
        model.addAttribute("comprasIdCliente" , comprasService.findByClienteId(cliente.getId()));
        return "cliente-id";
    }
    @GetMapping
    public String findByCaixaId(@RequestParam("Caixa-id")Caixa caixa, Model model){
        model.addAttribute("comprasIsCaixa" , comprasService.findByCaixaId(caixa.getId()));
        return  "caixa-id";
    }

    @DeleteMapping
    public void delete(@RequestParam("compras-id") Integer id){
        comprasService.delete(id);
    }

    @Override
    public CrudService<Compras, Integer> getService() {
        return null;
    }
}
