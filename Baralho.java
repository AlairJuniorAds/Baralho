/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baralho;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Baralho {
    
    private Cartas cartas;
    private int matrizBaralho[][];
    
    public Baralho(){
        matrizBaralho = new int[13][4];
        embaralharCartas();
    }

    /**
     * @return the cartas
     */
    public Cartas getCartas() {
        return cartas;
    }

    /**
     * @return the matrizBaralho
     */
    public int[][] getMatrizBaralho() {
        return matrizBaralho;
    }
    
    public void embaralharCartas(){
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int pos = r.nextInt(52);
                pos = cartas.values(pos);
            }
        }
    }
}
