/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.retoTecnico.service;

import com.example.retoTecnico.model.dao.TipoCambioDAO;
import com.example.retoTecnico.model.dto.ConversionRequest;
import com.example.retoTecnico.model.dto.ConversionResponse;
import com.example.retoTecnico.model.entity.TipoCambio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego
 */
@Service
public class ConversionService {
    @Autowired
    private TipoCambioDAO tipoCambioDAO;

    public ConversionResponse convertirMonedaOrigen(ConversionRequest request) {
        TipoCambio exchangeRate = tipoCambioDAO
            .findByMonedaOrigenAndMonedaDestino(request.getMonedaOrigen(), request.getMonedaDestino())
            .orElseThrow(() -> new RuntimeException("Tipo de cambio no encontrado"));

        Double montoConvertido = request.getMonto() * exchangeRate.getTasa();

        return new ConversionResponse(
            request.getMonto(),
            montoConvertido,
            request.getMonedaOrigen(),
            request.getMonedaDestino(),
            exchangeRate.getTasa()
        );
    }
}
