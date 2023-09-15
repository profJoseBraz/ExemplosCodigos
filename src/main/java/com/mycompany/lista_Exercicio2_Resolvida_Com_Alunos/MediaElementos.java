/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_Exercicio2_Resolvida_Com_Alunos;

/**
 *
 * @author 10156
 */
public class MediaElementos {
    public static void main(String args[]){
        float[] elementos = new float[5];
        
        elementos[0] = 10;
        elementos[1] = 10;
        elementos[2] = 10;
        elementos[3] = 10;
        elementos[4] = 10;
        
        float soma = 0;
        for(int i = 0; i < elementos.length; i++){
            soma = soma + elementos[i];
        }
        
        float media = soma / elementos.length;
        
        System.out.println("Média: " + media);
    }
}
