package com.br.natanael.site.Data;

import com.br.natanael.site.model.Caixa;
import com.br.natanael.site.model.Cliente;
import com.br.natanael.site.model.Compras;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;

public interface ComprasData extends JpaRepository<Compras, Integer> {

    List<Compras> findByDataCompra(LocalDate dataCompra, Pageable pageable);

    List<Compras> findByClienteId(Cliente id , Pageable pageable);

    Compras findById (Compras id, Pageable pageable);

    List<Compras> findByCaixaId(Caixa id, Pageable pageable);



}
