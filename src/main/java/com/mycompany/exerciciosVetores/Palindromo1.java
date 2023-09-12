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
public class Palindromo1 {
    //Verificação de palíndromo.
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        String palavra;
        
        System.out.println("Informe a palavra: ");
        palavra = scanner.nextLine();
        
        char[] letrasPalavraNormal = new char[palavra.length()];
        char[] letrasPalavraInvertida = new char[palavra.length()];
        
        int contInv = palavra.length();
        
        boolean palindromo = true;
        
        for(int i = 0; i < palavra.length(); i++){
            contInv--;
            letrasPalavraNormal[i] = palavra.charAt(i); //Atribui as letras na ordem correta
            letrasPalavraInvertida[i] = palavra.charAt(contInv); //Atribui as letras na ordem inversa
        }
        
        for(int i = 0; i < palavra.length(); i++){;
            //Verifica se as letras dos dois vetores são sempre iguais.
            //Caso pelo menos uma for diferente significa que a palavra não é um palíndromo.
            if(letrasPalavraNormal[i] != letrasPalavraInvertida[i]){
                palindromo = false;
                break;
            }
        }
        
        if(palindromo){
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        }else{
            System.out.println("A palavra " + palavra + " NÃO é um palíndromo.");
        }
    }
}
