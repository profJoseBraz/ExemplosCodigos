/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplosCondicionais_LacosRepeticao;

import java.util.Scanner;

/**
 *
 * @author jose_
 */
public class Exercicio1 {
    //Soma de dois números
    public static void main(String[] args) {
        int num1, num2, soma;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextInt();
        
        System.out.println("Informe o segundo número: ");
        num2 = scanner.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("Resultado da soma: " + soma);
    }
}
