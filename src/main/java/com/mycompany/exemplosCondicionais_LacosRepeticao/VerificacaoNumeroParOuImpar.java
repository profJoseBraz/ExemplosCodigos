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
public class VerificacaoNumeroParOuImpar {
    //Verificação se número é par ou ímpar
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int num, modulo;
        
        System.out.println("Informe um número: ");
        num = scanner.nextInt();
        
        modulo = num % 2;
        
        if(modulo == 0){
            System.out.println("O número " + num + " é par.");
        }else{
            System.out.println("O número " + num + " é ímpar.");
        }
    }
}
