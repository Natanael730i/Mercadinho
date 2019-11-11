package com.br.natanael.site.Data;

import com.br.natanael.site.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface ClienteData extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByCpf(String cpf, Pageable pageable);

    List<Cliente> findByNome(String nome, Pageable pageable);
}
