/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosVetores;

import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class ContagemCaracteres {
    public static void main(String args[]){
//        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou frase: ");
        String texto = new Scanner(System.in).nextLine();
        
        int numCaracteres = 0;
        
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) != ' '){
                numCaracteres++;
            }
        }
        
        System.out.println("A palavra/frase " + texto + " possui " + numCaracteres + " letras.");
    }
}
