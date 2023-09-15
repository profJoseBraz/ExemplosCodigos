/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_Exercicio2_Resolvida_Com_Alunos;

/**
 *
 * @author 10156
 */
public class InversaoElementos {
    public static void main(String args[]){
        int[] elementos = new int[5];
        int[] elementosInv = new int[5];
        
        elementos[0] = 15;
        elementos[1] = 67;
        elementos[2] = 1057;
        elementos[3] = 205;
        elementos[4] = 97;
        
        int contInv = elementos.length;
        for(int i = 0; i < elementos.length; i++){
            contInv--;
            elementosInv[i] = elementos[contInv];
        }
        
        System.out.println("Valores na ordem normal: ");
        for(int i = 0; i < elementos.length; i++){
            System.out.println(elementos[i]);
        }
        
        System.out.println("Valores na ordem inversa: ");
        for(int i = 0; i < elementos.length; i++){
            System.out.println(elementosInv[i]);
        }
    }
}
