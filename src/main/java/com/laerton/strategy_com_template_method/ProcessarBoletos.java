/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laerton.strategy_com_template_method;

import com.laerton.entitie.Boleto;
import java.util.List;

/**
 *
 * @author laerton
 */
public class ProcessarBoletos {
    private LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public final void processar(String nomeArquivo) {
        System.out.println("Boletos");
        System.out.println("#--------------------------------------------#");
        List<Boleto> boletos = leituraRetorno.lerArquivo(nomeArquivo);
        
        boletos.stream().forEach(boleto -> System.out.println(boleto));
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
