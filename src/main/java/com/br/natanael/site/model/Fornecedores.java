package com.br.natanael.site.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Fornecedores  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORNECEDOR" , nullable = false)
    private Integer id;

    @Column(name = "NOME_FORNECEDOR", nullable = false)
    private String nome;

    @Column(name = "CNPJ", nullable = false)
    private String cnpj;

    @Column(name = "TELEFONE")
    private String telefone;
}
