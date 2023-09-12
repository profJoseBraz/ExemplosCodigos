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
public class MediaPonderada {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        float num1, num2, peso1, peso2, resultado;
        
        System.out.println("Informe o primeiro valor: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo valor: ");
        num2 = scanner.nextFloat();
        
        peso1 = 1;
        peso2 = 1;
        
        resultado = ((num1 * peso1) + (num2 * peso2)) / (peso1 + peso2);
        
        System.out.println("A média ponderada é: " + resultado);
    }
}
