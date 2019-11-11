package com.br.natanael.site.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMPRA", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_COMPRADOR")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "CAIXA_VENDEDOR")
    private Caixa caixa;

    @Column(name = "DATA_COMPRA", nullable = false)
    private LocalDate dataCompra;

}
