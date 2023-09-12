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
public class MediaTresNumeros {
    //Média de três números
    public static void main(String[] args) {
        float num1, num2, num3, media;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextInt();
        
        System.out.println("Informe o segundo número: ");
        num2 = scanner.nextInt();
        
        System.out.println("Informe o terceiro número: ");
        num3 = scanner.nextInt();
        
        media = (num1 + num2 + num3) / 3;
        
        System.out.println("Média: " + media);
    }
}
