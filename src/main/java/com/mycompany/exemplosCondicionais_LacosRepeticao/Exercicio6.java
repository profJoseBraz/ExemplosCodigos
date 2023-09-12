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
public class Exercicio6 {
    //Gerador de tabuada
    public static void main(String[] args) {
        int numTabuada, mult;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o número da tabuada que deseja: ");
        numTabuada = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            mult = numTabuada * i;
            System.out.println(numTabuada + " x " + i + " = " + mult);
        }
    }
}
