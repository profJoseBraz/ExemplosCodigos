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
public class Exercicio8 {
    //Cálculo de percentual
    public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);
        
        float num, percentual, resultado;
        
        System.out.println("Informe um número: ");
        num = scanner.nextFloat();
        
        System.out.println("Informe um percentual: ");
        percentual = scanner.nextFloat();
        
        resultado = ((num * percentual) / 100);
        
        System.out.println(percentual + "% de " + num + " é: " + resultado);
    }
}
