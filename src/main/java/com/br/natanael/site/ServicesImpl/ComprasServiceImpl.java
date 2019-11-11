package com.br.natanael.site.ServicesImpl;

import com.br.natanael.site.Framework.CrudServiceImpl;
import com.br.natanael.site.Services.ComprasService;
import com.br.natanael.site.model.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ComprasServiceImpl extends CrudServiceImpl<Compras, Integer> implements ComprasService {
    @Override
    public JpaRepository<Compras, Integer> getRepository() {
        return null;
    }

    @Override
    public List<Compras> findByDataCompra(LocalDate dataCompra) {
        return null;
    }

    @Override
    public List<Compras> findByClienteId(Integer id) {
        return null;
    }

    @Override
    public List<Compras> findByCaixaId(Integer id) {
        return null;
    }
}
