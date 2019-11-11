package com.br.natanael.site.Controller;

import com.br.natanael.site.Framework.CrudRestController;
import com.br.natanael.site.Framework.CrudService;
import com.br.natanael.site.Services.ClienteService;
import com.br.natanael.site.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("clientes")
public class ClienteController extends CrudRestController<Cliente, Integer> {

    @Autowired private ClienteService clienteService ;

    @GetMapping
    public String findByNome(@RequestParam("nome") String nome, Model model){
        model.addAttribute("cliente", clienteService.findByNome(nome));
        return "cliente";
    }
    @GetMapping
    public String findById(@RequestParam("id")Integer id, Model model){
        model.addAttribute("cliente", clienteService.findOne(id).get());
        return "cliente";
    }
    @PostMapping
    public String save(@RequestParam("cliente")Cliente cliente, Model model){
        model.addAttribute("cliente", clienteService.save(cliente));
        return "cliente-save";
    }
    @DeleteMapping
    public void delete(@RequestParam("cliente")Integer id, Model model){
        clienteService.delete(id);
    }

    @Override
    public CrudService<Cliente, Integer> getService() {
        return null;
    }
}
