/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplosCondicionais_LacosRepeticao;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class Exercicio10 {
    public static void main(String arggs[]){
        Scanner scanner = new Scanner(System.in);
        
        int maximo;
        BigInteger numAnterior = BigInteger.ZERO, numAtual = BigInteger.ONE;
        
        System.out.println("Informe o limite re repetições?");
        maximo = scanner.nextInt();
        
        System.out.println("-----FIBONACCI-----");
        for(int i = 0; i < maximo; i++){
            BigInteger numTemp = numAtual;
            numAtual = numAtual.add(numAnterior);
            numAnterior = numTemp;
            
            System.out.println(numAnterior);
        }
    }
}
