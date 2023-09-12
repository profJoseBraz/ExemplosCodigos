/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosVetores;

/**
 *
 * @author 10156
 */
public class MesclagemVetores {
    public static void main(String args[]){
        int[] elementos1 = new int[10];
        int[] elementos2 = new int[5];
        
        elementos1[0] = 54;
        elementos1[1] = 105;
        elementos1[2] = 8;
        elementos1[3] = 1024;
        elementos1[4] = 97;
        elementos1[5] = 56;
        elementos1[6] = 437;
        elementos1[7] = 87;
        elementos1[8] = 5;
        elementos1[9] = 14;
        
        elementos2[0] = 1000;
        elementos2[1] = 2000;
        elementos2[2] = 3000;
        elementos2[3] = 4000;
        elementos2[4] = 5000;
        
        int[] elementosMesc = new int[elementos1.length + elementos2.length];
    
        for(int i = 0; i < elementos1.length; i++){
            elementosMesc[i] = elementos1[i];
        }
        
        for(int i = 0; i < elementos2.length; i++){
            elementosMesc[elementos1.length + i] = elementos2[i];
        }
        
        for(int i = 0; i < elementosMesc.length; i++){
            System.out.println(elementosMesc[i]);
        }
    }
}
