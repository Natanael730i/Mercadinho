package com.br.natanael.site.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO" , nullable = false)
    private Integer id;

    @Column(name = "NOME_PRODUTO" , nullable = false)
    private String nome;

    @Column(name = "FORNECEDOR")
    private Fornecedores fornecedores;

    @Column(name = "TIPOS")
    private TiposProdutos tiposProdutos;

    @Column(name = "TELEFONE_CONTATO")
    private String telefone;

    @Column(name = "DATA_COMPRA")
    @ManyToOne(cascade = CascadeType.ALL)
    private Compras compras;

    @Column(name = "TELEFONE_RECADOS")
    private String telefoneRecados;

}
