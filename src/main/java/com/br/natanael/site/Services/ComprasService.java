package com.br.natanael.site.Services;

import com.br.natanael.site.Framework.CrudService;
import com.br.natanael.site.model.Cliente;
import com.br.natanael.site.model.Compras;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface ComprasService extends CrudService<Compras, Integer> {

    static Compras findById(Integer id) {
        return null;
    }

    List<Compras> findByDataCompra(LocalDate dataCompra);

    List<Compras> findByClienteId(Integer id);

    List<Compras> findByCaixaId(Integer id);
}
