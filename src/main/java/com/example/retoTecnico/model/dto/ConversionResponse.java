/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.retoTecnico.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Diego
 */
@Data
@AllArgsConstructor
public class ConversionResponse {
    private Double montoOriginal;
    private Double montoConvertido;
    private String monedaOrigen;
    private String monedaDestino;
    private Double tipoCambio;
}
