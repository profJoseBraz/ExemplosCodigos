/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplosCondicionais_LacosRepeticao;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class Fibonacci {
    public static void main(String arggs[]){
        Scanner scanner = new Scanner(System.in);
        
        int maximo;
        int primeiroNumero = 0, segundoNumero = 1, proximoNumero;
        
        System.out.println("Informe o limite re repetições?");
        maximo = scanner.nextInt();
        
        System.out.println("-----FIBONACCI-----");
        System.err.println(primeiroNumero);
        System.out.println(segundoNumero);
        for(int i = 0; i < maximo; i++){
            proximoNumero = primeiroNumero + segundoNumero;
            
            System.out.println(proximoNumero);
            
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }
    }
}
