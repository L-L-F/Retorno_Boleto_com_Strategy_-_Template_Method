
import com.laerton.strategy_com_template_method.LeituraRetornoBancoBradesco;
import com.laerton.strategy_com_template_method.LeituraRetornoBancoBrasil;
import com.laerton.strategy_com_template_method.ProcessarBoletos;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author laerton
 */
public class Principal {
    public static void main(String[] args) {
        final ProcessarBoletos processarBoletoBradesco = new ProcessarBoletos(new LeituraRetornoBancoBradesco());
        String boletoBradesco = Principal.class.getResource("bradesco-1.csv").getPath();
        
        final ProcessarBoletos processarBoletoBB = new ProcessarBoletos(new LeituraRetornoBancoBrasil());
        String boletoBancoBrasil = Principal.class.getResource("banco-brasil-1.csv").getPath();

        processarBoletoBradesco.processar(boletoBradesco);
        System.out.println("Lendo arquivo "+ boletoBradesco +"\n");
        
        processarBoletoBB.processar(boletoBancoBrasil);
        System.out.println("Lendo arquivo "+ boletoBancoBrasil +"\n");
    }
}
