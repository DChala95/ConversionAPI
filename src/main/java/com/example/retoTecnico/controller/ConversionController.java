/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.retoTecnico.controller;

import com.example.retoTecnico.model.dto.ConversionRequest;
import com.example.retoTecnico.model.dto.ConversionResponse;
import com.example.retoTecnico.service.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Diego
 */
@RestController
@RequestMapping("/api/retoTecnico")
public class ConversionController {
    @Autowired
    private ConversionService conversionService;

    @PostMapping("/convertir")
    public ResponseEntity<ConversionResponse> convertirMonedaOrigen(@RequestBody ConversionRequest request) {
        ConversionResponse response = conversionService.convertirMonedaOrigen(request);
        return ResponseEntity.ok(response);
    }
}
