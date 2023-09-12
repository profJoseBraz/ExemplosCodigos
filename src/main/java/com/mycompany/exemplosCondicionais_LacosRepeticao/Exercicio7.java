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
public class Exercicio7 {
    //Cálculo de fatorial
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int num, numFixo, fatorial;
        
        System.out.println("Insira o valor: ");
        num = scanner.nextInt();
        
        fatorial = num;
        numFixo = num;
        while(num > 1){
            System.out.println(fatorial + " x " + (num - 1) + " = " + fatorial * (num - 1));
            
            fatorial = fatorial * (num - 1);
            
            num--;
        }
        
        System.out.println("O fatorial de " + numFixo + " é : " + fatorial);
    }
}
