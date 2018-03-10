/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.udistrital.teoria.pruebas;

/**
 *
 * @author Fernando
 */
public class Test {

    public static void main(String[] args) {
        String palabra = "Hola";
        String palabraCodificada = "";
        char[] array = palabra.toCharArray();
        for (char c : array) {
            System.out.println("ASCII: " + (int) c);
            System.out.println("BINARY: " + Integer.toBinaryString(c));
            palabraCodificada += Integer.toBinaryString(c);
        }
        System.out.println("Palabra Codificada: " + palabraCodificada);

        int[] bitsLogicos = {0, 1};
        int[] bitsOperadores = {0, 1};

        for (int bitsLogico : bitsLogicos) {
            for (int bitsOperador : bitsOperadores) {
                System.out.println("XOR " + bitsLogico + "-" + bitsOperador + ":" + (bitsLogico ^ bitsOperador));
            }
        }

    }
}
