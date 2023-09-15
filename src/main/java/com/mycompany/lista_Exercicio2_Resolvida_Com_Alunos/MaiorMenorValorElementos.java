/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_Exercicio2_Resolvida_Com_Alunos;

/**
 *
 * @author 10156
 */
public class MaiorMenorValorElementos {
    public static void main(String args[]){
        int[] elementos = new int[5];
        
        elementos[0] = 105;
        elementos[1] = 67;
        elementos[2] = 1057;
        elementos[3] = 37;
        elementos[4] = 197;
        
        int maior = elementos[0];
        for(int i = 0; i < elementos.length; i++){
            if(elementos[i] > maior){
                maior = elementos[i];
            }
        }
       
        int menor = elementos[0];
        for(int i = 0; i < elementos.length; i++){
            if(elementos[i] < menor){
                menor = elementos[i];
            }
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
