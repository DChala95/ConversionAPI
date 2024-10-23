/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.retoTecnico.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Diego
 */
@Entity
@Data
@NoArgsConstructor
public class TipoCambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String monedaOrigen;
    private String monedaDestino;
    private Double tasa;

    public TipoCambio(String monedaOrigen, String monedaDestino, Double tasa) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.tasa = tasa;
    }
}
