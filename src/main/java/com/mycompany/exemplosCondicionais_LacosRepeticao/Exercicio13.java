/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplosCondicionais_LacosRepeticao;

import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class Exercicio13 {
    //Verificar o maior e o menor número em uma lista (com 4 números)
    //Usando o Math.max e Math.min
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2, num3, num4, maior = 0, menor = 0;
        
        System.out.println("Informe o primeiro número da lista: ");
        num1 = scanner.nextInt();
        
        System.out.println("Informe o primeiro número da lista: ");
        num2 = scanner.nextInt();
        
        System.out.println("Informe o primeiro número da lista: ");
        num3 = scanner.nextInt();
        
        System.out.println("Informe o primeiro número da lista: ");
        num4 = scanner.nextInt();
        
        maior = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        menor = Math.min(Math.min(num1, num2), Math.min(num3, num4));
        
        System.err.println("O maior número da lista é: " + maior);
        System.out.println("O menor número da lista é: " + menor);
    }
}
