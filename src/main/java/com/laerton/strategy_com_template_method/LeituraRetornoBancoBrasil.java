/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laerton.strategy_com_template_method;

import com.laerton.entitie.Boleto;
import java.time.LocalDate;

/**
 *
 * @author laerton
 */
public final class LeituraRetornoBancoBrasil implements LeituraRetorno {
    
    @Override
    public Boleto completarDados(String[] vetor) {
        Boleto boleto = new Boleto();
        
        boleto.setId(Integer.parseInt(vetor[0]));
        boleto.setCodBanco(vetor[1]);
        boleto.setDtVencimento(LocalDate.parse(vetor[2], FORMATO_DATA));
        boleto.setDtPagamento(LocalDate.parse(vetor[3], FORMATO_DATA).atTime(0, 0, 0));
        boleto.setCpfCliente(vetor[4]);
        boleto.setValor(Double.parseDouble(vetor[5]));
        boleto.setMulta(Double.parseDouble(vetor[6]));
        boleto.setJuros(Double.parseDouble(vetor[7]));
        return boleto;
    }
}
