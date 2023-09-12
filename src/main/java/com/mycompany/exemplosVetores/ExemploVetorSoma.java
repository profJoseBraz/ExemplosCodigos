/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplosVetores;

/**
 *
 * @author 10156
 */
public class ExemploVetorSoma {
    public static void main(String args[]){
        int[] numeros = new int[5];
        int soma = 0;
        
        numeros[0] = 1; //Atribuição de valor à primeira posição;
        numeros[1] = 15; //Atribuição de valor à segunda posição;
        numeros[2] = 8; //Atribuição de valor à terceira posição;
        numeros[3] = 847; //Atribuição de valor à quarta posição;
        numeros[4] = 123; //Atribuição de valor à quinta posição;
    
        for(int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }
        
        System.out.println("Resultado da soma: " + soma);
    }
}
