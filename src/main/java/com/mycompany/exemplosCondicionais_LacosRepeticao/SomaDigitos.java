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
public class SomaDigitos {
    //Soma dos dígitos de um número
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero, numeroApresentar, digito, soma = 0;
        
        System.out.println("Insira um número inteiro: ");
        numeroApresentar = scanner.nextInt();
        
        numero = numeroApresentar;
        while (numero != 0) {
            digito = numero % 10; //Recupera o valor após a vírgula
            soma += digito; //Soma o dígito extraído
            numero /= 10; //Divide o número por 10 e considera apenas os valors antes da vírgula
        }
        
        System.out.println("A soma dos dígitos de " + numeroApresentar + " é: " + soma);
    }
}
