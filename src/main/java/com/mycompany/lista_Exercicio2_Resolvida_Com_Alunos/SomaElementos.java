/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_Exercicio2_Resolvida_Com_Alunos;

/**
 *
 * @author 10156
 */
public class SomaElementos {
    public static void main(String args[]){
        int[] elementos = new int[5];
        
        elementos[0] = 15;
        elementos[1] = 35;
        elementos[2] = 107;
        elementos[3] = 20;
        elementos[4] = 8;
        
        int soma = 0;
        for(int i = 0; i < elementos.length; i++){
            soma = soma + elementos[i];
        }
        
        System.out.println("Soma dos elementos: " + soma);
    }
}
