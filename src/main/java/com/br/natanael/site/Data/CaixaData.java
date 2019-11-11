package com.br.natanael.site.Data;


import com.br.natanael.site.model.Caixa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface CaixaData extends JpaRepository<Caixa, Integer> {

    List<Caixa> findByCpf(String cpf, Pageable pageable);

    List<Caixa> findByNome(String nome, Pageable pageable);


}
