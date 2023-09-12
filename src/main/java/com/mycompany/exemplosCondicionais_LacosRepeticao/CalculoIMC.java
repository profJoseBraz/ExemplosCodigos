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
public class CalculoIMC {
    //Cálculo de IMC
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        float peso, altura, imc;
        
        System.out.println("Informe seu peso: ");
        peso = scanner.nextFloat();
        
        System.out.println("Informe sua altura: ");
        altura = scanner.nextFloat();
        
        imc = (float) (peso / Math.pow(altura, 2));
       
        System.out.println("IMC: " + imc);
    }
}
