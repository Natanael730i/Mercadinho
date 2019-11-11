package com.br.natanael.site.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Caixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CAIXA" , nullable = false)
    private Integer id;

    @Column(name = "NOME_CAIXA" , nullable = false)
    private String nome;

    @Column(name = "CPF_CAIXA", nullable = false)
    private String cpf;

    @Column(name = "TELEFONE_CONTATO")
    private String telefone;

    @Column(name = "CTPS_CAIXA")
    private String ctps;

    @Column(name = "TELEFONE_CONTATO")
    private String telefoneContato;

    @Column(name = "CAIXA_SALARIO")
    private Double salarioCaixa;
}
