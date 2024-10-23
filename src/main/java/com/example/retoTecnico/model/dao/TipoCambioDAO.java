/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.retoTecnico.model.dao;

import com.example.retoTecnico.model.entity.TipoCambio;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Diego
 */
public interface TipoCambioDAO extends JpaRepository<TipoCambio, Long>{
    Optional<TipoCambio> findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);
}
