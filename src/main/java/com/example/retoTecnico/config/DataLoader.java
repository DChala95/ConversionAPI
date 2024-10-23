/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.retoTecnico.config;

import com.example.retoTecnico.model.dao.TipoCambioDAO;
import com.example.retoTecnico.model.entity.TipoCambio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Diego
 */
@Component
public class DataLoader implements CommandLineRunner{
    @Autowired
    private TipoCambioDAO tipoCambioDAO;

    @Override
    public void run(String... args) {
        tipoCambioDAO.save(new TipoCambio("PEN", "USD", 0.27));
        tipoCambioDAO.save(new TipoCambio("USD", "PEN", 3.70));
        tipoCambioDAO.save(new TipoCambio("EUR", "USD", 1.10));
        tipoCambioDAO.save(new TipoCambio("USD", "EUR", 0.91));
    }
}
