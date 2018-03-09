/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Fernando
 */
public class Test {
    
    public static void main(String[] args) {
        String palabra = "Hola";
        char[] array = palabra.toCharArray();
        for (char c : array) {
            System.out.println("ASCII: " + (int) c);
            System.out.println("BINARY: " + Integer.toBinaryString(c));
        }
    }
}
