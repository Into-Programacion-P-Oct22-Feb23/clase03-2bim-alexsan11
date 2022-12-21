/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */x`
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}}; //
        /*
            1   4   3      // Alex Sanchez
            36  64  9
         */
        double[][] resultado = new double[2][3];
        double valor;
        String cadena = " ";

        for (int f = 0; f < dato1.length; f++) {
            for (int c = 0; c < dato1[f].length; c++) {
                valor = dato1[f][c];
                if (valor % 2 == 0) {
                    resultado[f][c] = Math.pow(valor, 2);
                    
                } else {
                    resultado[f][c] = valor;
                   
                }

            }
        }
        for (int f = 0; f < dato1.length; f++) {
           
            for (int c = 0; c < dato1[f].length; c++) {
            cadena = String.format("%s%d\t", cadena, dato1[f][c]);
            }
        }
          
    }

}
