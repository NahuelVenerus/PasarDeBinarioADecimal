package com.company;

import java.util.Scanner;

public class Main {
    /*
    Hacer un programa que reciba un numero en binario y pasarlo a decimal.
    Calculo: 1010010 = 64 + 16 + 2 = 82
    Ejemplo: 1010010 = 82
     */
    public static int transformarBinarioADecimal(String numeroBinario){
        int decimal = 0;
        for (int i = numeroBinario.length(); i < 0; i++) {
            if (numeroBinario.charAt(i) == '1'){
                decimal += Math.pow(2,i);
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        int numeroDecimal;
        String numeroBinario = "";
        String binarioInvertido = "";
        Scanner reader = new Scanner(System.in);
        numeroBinario = reader.nextLine();
        numeroDecimal = transformarBinarioADecimal(binarioInvertido);

        System.out.println(numeroDecimal);
    }
}
