package br.com.despesas.M3S05ExerciciosFuturoDev.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.math.BigDecimal;

@Data
@Entity
public class Despesas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String credor;


    @Column(name = "data_vencimento", nullable = false)
    private Date dataVencimento;

    @Column(name = "data_pagamento", nullable = false)
    private Date dataPagamento;


    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(columnDefinition = "text")
    private String descricao;

    @Column(nullable = false)
    private String status = "Pendente";


    public void setDataDePagamento(LocalDate now) {
    }
}
