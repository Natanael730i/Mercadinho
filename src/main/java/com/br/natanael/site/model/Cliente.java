package com.br.natanael.site.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE" , nullable = false)
    private Integer id;

    @Column(name = "NOME_CLIENTE" , nullable = false)
    private String nome;

    @Column(name = "CPF_CLIENTE", nullable = false)
    private String cpf;

    @Column(name = "TELEFONE_CONTATO")
    private String telefone;

    @Column(name = "TELEFONE_RECADOS")
    private String telefoneRecados;

}
