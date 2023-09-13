/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplosVetores;

import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class ContagemCaracteres {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        String texto;
        
        System.out.println("Informe um texto: ");
        texto = scanner.nextLine();
        
        int contCaracteres = 0;
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) != ' '){
                contCaracteres++;
            }
        }
        
        System.out.println("O texo digitado possui " + contCaracteres + " letras.");
    }
}
