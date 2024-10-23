/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.retoTecnico.model.dto;

import lombok.Data;

/**
 *
 * @author Diego
 */
@Data
public class ConversionRequest {
    private Double monto;
    private String monedaOrigen;
    private String monedaDestino;
    
}
