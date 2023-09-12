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
public class VerificacaoNumeroPrimo {
    //Verificação de número primo
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int num, limite;
  
        System.out.println("Informe um limite de verificação: ");
        limite = scanner.nextInt();
        
        System.out.println("Informe um número: ");
        num = scanner.nextInt();
       
        if(num <= limite){
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    System.out.println("O número " + num + " NÃO é primo.");
                    System.exit(0);
                }
            }
            
            System.out.println("O número " + num + " é primo.");
        }else{
            System.out.println("O número informado está fora dos limites de checagem!");
        }
    }
}
