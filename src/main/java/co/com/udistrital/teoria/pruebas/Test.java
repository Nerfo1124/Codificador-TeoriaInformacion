/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.udistrital.teoria.pruebas;

import co.com.udistrital.teoria.vo.MemoryElementVO;
import co.com.udistrital.teoria.vo.OutputElementVO;

/**
 *
 * @author Fernando
 */
public class Test {

    public static void main(String[] args) {
        String palabra = "Hola";
        String palabraBinaria = "";
        char[] array = palabra.toCharArray();
        for (char c : array) {
            System.out.println("ASCII: " + (int) c);
            System.out.println("BINARY: " + Integer.toBinaryString(c));
            palabraBinaria += Integer.toBinaryString(c);
        }
        System.out.println("Palabra en Binario: " + palabraBinaria);

        int[] bitsLogicos = {0, 1};
        int[] bitsOperadores = {0, 1};

        // Tabla XOR
//        for (int bitsLogico : bitsLogicos) {
//            for (int bitsOperador : bitsOperadores) {
//                System.out.println("XOR " + bitsLogico + "-" + bitsOperador + ":" + (bitsLogico ^ bitsOperador));
//            }
//        }

        // Codificacion de la palabra
        String palabraCodificada = "";
        char [] codesPalabra = palabraBinaria.toCharArray();
        MemoryElementVO m1 = new MemoryElementVO(0);
        OutputElementVO s1 = null;
        OutputElementVO s2 = null;
        
        for (char c : codesPalabra) {
            Integer input = Integer.parseInt(""+c);
            m1.setNextState(input);
            s1 = new OutputElementVO(input, 0);
            s2 = new OutputElementVO(input, m1.getState());
            
            palabraCodificada += s1.getXORResult()+ "" + s2.getXORResult();
            m1.setState(m1.getNextState());
        }
        
        System.out.println("Palabra codificada: " + palabraCodificada);
    }
}
