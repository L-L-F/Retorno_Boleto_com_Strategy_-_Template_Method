/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laerton.strategy_com_template_method;

import com.laerton.entitie.Boleto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laerton
 */
public interface LeituraRetorno {
    
    DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    default List<Boleto> lerArquivo(String nomeArquivo) {
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String linha;
            List<Boleto> boletos = new ArrayList<>();

            while ((linha = bufferedReader.readLine()) != null) {
                String[] vetor = linha.split(";");
                Boleto boleto = completarDados(vetor);
                boletos.add(boleto);
            }
            return boletos;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    abstract Boleto completarDados(String[] vetor);
}
