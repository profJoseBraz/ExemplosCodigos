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
public class Exercicio9 {
    //Verificação de número primo
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int num;
        
        System.out.println("Informe um número: ");
        num = scanner.nextInt();
        
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                System.out.println("O número " + num + " NÃO é primo.");
                System.exit(0);
            }
        }
        
        System.out.println("O número " + num + " é primo.");
    }
}
