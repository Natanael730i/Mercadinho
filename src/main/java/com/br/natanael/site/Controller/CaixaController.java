package com.br.natanael.site.Controller;

import com.br.natanael.site.Framework.CrudRestController;
import com.br.natanael.site.Framework.CrudService;
import com.br.natanael.site.Services.CaixaService;
import com.br.natanael.site.model.Caixa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("caixa")
public class CaixaController extends CrudRestController<Caixa , Integer> {

    @Autowired
    CaixaService caixaService;

    @GetMapping
    public String findByNome(@RequestParam("nome") String nome, Model model){
        model.addAttribute("caixa", caixaService.findByNome(nome));
        return "caixa";
    }
    @GetMapping
    public String findById(@RequestParam("id")Integer id, Model model){
        model.addAttribute("caixa", caixaService.findOne(id).get());
        return "caixa";
    }
    @PostMapping
    public String save(@RequestParam("caixa") Caixa caixa, Model model){
        model.addAttribute("caixa", caixaService.save(caixa));
        return "caixa-save";
    }
    @DeleteMapping
    public void delete(@RequestParam("caixa")Integer id, Model model){
        caixaService.delete(id);
    }
    @Override
    public CrudService<Caixa, Integer> getService() {
        return null;
    }
}
