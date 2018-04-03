/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.udistrital.teoria.presentacion;

import co.com.udistrital.teoria.vo.MachineStatesVO;
import co.com.udistrital.teoria.vo.StatesVO;

/**
 *
 * @author Fernando
 */
public class Test {

    public static void main(String[] args) {
        MachineStatesVO machine = new MachineStatesVO();

        Integer numMemorias = 2;
        Integer numEstados = (int) Math.pow(2, numMemorias);

        machine.addOperacion("M1 XOR M2");
//        machine.addOperacion("M2 XOR M3");
        machine.addOperacion("E");

        for (int i = 0; i < numEstados; i++) {
            if ((numMemorias - Integer.toBinaryString(i).length()) > 0) {
                String regex = "%0" + (numMemorias - Integer.toBinaryString(i).length()) + "d";
                machine.addEstado(new StatesVO("S" + i, String.format(regex, 0) + Integer.toBinaryString(i)));
            } else {
                machine.addEstado(new StatesVO("S" + i, Integer.toBinaryString(i)));
            }
        }

        String finEstado = "S1";
        String iniEstado = machine.getEstados().get(0).getName();
        String secuenciaFin = "";
        Boolean sec = Boolean.FALSE;//Boolean.TRUE;
        while (sec) {
            for (int i = 0; i < machine.getEstados().size(); i++) {
                String nextState0 = "";
                String nextState1 = "";
                if (machine.getEstados().get(i).getName().equals(finEstado)) {
                    nextState0 = machine.getEstados().get(i).nextValues(0);
                    nextState1 = machine.getEstados().get(i).nextValues(1);
                    if (machine.getNameState(nextState0).equals(iniEstado)) {
                        secuenciaFin += 0;
                        sec = Boolean.FALSE;
                        break;
                    } else if(machine.getNameState(nextState1).equals(iniEstado)){
                        secuenciaFin += 1;
                        sec = Boolean.FALSE;
                        break;
                    } else {
                        
                    }
                }
            }
        }
    }
    
    public String getStateMinor(String st1, String st2) {
        return null;
    }
}
