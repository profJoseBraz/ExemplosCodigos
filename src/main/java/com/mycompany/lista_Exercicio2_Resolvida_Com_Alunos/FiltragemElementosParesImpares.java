/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_Exercicio2_Resolvida_Com_Alunos;

/**
 *
 * @author 10156
 */
public class FiltragemElementosParesImpares {
    public static void main(String args[]){
        int[] elementos = new int[10];
        
        elementos[0] = 1;
        elementos[1] = 2;
        elementos[2] = 3;
        elementos[3] = 4;
        elementos[4] = 5;
        elementos[5] = 6;
        elementos[6] = 7;
        elementos[7] = 8;
        elementos[8] = 9;
        elementos[9] = 10;
        
        int contPares = 0;
        int contImpares = 0;
        for(int i = 0; i < elementos.length; i++){
            if(elementos[i] % 2 == 0){
                contPares++;
            }else{
                contImpares++;
            }
        }
        
        System.out.println("contagem de pares: " + contPares);
        System.out.println("Contagem de ímpares: " + contImpares);
    }
}
