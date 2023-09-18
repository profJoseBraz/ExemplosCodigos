/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_Exercicio2_Resolvida_Com_Alunos;

/**
 *
 * @author 10156
 */
public class OrdenacaoVetor {
    public static void main(String args[]){
        int[] elementos = new int[10];
        int indiceMenor;
        
        elementos[0] = 35;
        elementos[1] = 5;
        elementos[2] = 167;
        elementos[3] = 67;
        elementos[4] = 1054;
        elementos[5] = 39;
        elementos[6] = 21;
        elementos[7] = 94;
        elementos[8] = 7;
        elementos[9] = 109;
        
        for(int i = 0; i < elementos.length; i++){
            indiceMenor = i;
            for(int j = i; j < elementos.length; j++){
                if(elementos[j] < elementos[indiceMenor]){
                    indiceMenor = j;
                }
            }
            
            int temp = elementos[i];
            elementos[i] = elementos[indiceMenor];
            elementos[indiceMenor] = temp;
        }
        
        for(int i = 0; i < elementos.length; i++){
            System.out.println(elementos[i]);
        }
    }
}
