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
public final class LeituraRetornoBancoBradesco implements LeituraRetorno {
    
    @Override
    public Boleto completarDados(String[] vetor) {
        Boleto boleto = new Boleto();
        
        boleto.setId(Integer.parseInt(vetor[0]));
        boleto.setCodBanco(vetor[1]);
        boleto.setAgencia(vetor[2]);
        boleto.setContaBancaria(vetor[3]);
        boleto.setDtVencimento(LocalDate.parse(vetor[4], FORMATO_DATA));
        boleto.setDtPagamento(LocalDate.parse(vetor[5], FORMATO_DATA_HORA).atTime(23, 59, 59));
        boleto.setCpfCliente(vetor[6]);
        boleto.setValor(Double.parseDouble(vetor[7]));
        boleto.setMulta(Double.parseDouble(vetor[8]));
        boleto.setJuros(Double.parseDouble(vetor[9]));
        return boleto;
    }  
}
