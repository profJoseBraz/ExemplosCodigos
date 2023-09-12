/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplosCondicionais_LacosRepeticao;

import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class ExemploArray {
    //Contagem de caracteres
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        String texto;
        
        int contCaracteres = 0;
        
        System.out.println("Digite um texto: ");
        texto = scanner.nextLine();
        
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) != ' '){
                contCaracteres = contCaracteres + 1;
            }
        }
        
        System.out.println("O texto " + texto + " possui " + contCaracteres + " palavras.");
    }
}
