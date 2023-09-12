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
public class Exercicio12 {
    //Verificação de maior e menor número de uma lista sem usar laço de repetição
    //Sem usar o Math.min e Math.max
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2, num3, num4, maior = 0, menor = 0;
        
        System.out.println("Informe o primeiro número da lista: ");
        num1 = scanner.nextInt();
        
        System.out.println("Informe o primeiro número da lista: ");
        num2 = scanner.nextInt();
        
        System.out.println("Informe o primeiro número da lista: ");
        num3 = scanner.nextInt();
        
        System.out.println("Informe o primeiro número da lista: ");
        num4 = scanner.nextInt();
        
        //Verificação do maior número da lista
        if((num1 > num2) && (num1 > num3) && (num1 > num4)){
            maior = num1;
        }
        else if((num2 > num1) && (num2 > num3) && (num2 > num4)){
            maior = num2;
        }
        else if((num3 > num1) && (num3 > num2) && (num3 > num4)){
            maior = num3;
        }
        else if((num4 > num1) && (num4 > num3) && (num4 > num2)){
            maior = num4;
        }
        
        //Verificação de menor número de uma lista
        if((num1 < num2) && (num1 < num3) && (num1 < num4)){
            menor = num1;
        }
        else if((num2 < num1) && (num2 < num3) && (num2 < num4)){
            menor = num2;
        }
        else if((num3 < num1) && (num3 < num2) && (num3 < num4)){
            menor = num3;
        }
        else if((num4 < num1) && (num4 < num3) && (num4 < num2)){
            menor = num4;
        }
        
        System.err.println("O maior número da lista é: " + maior);
        System.out.println("O menor número da lista é: " + menor);
    }
}
