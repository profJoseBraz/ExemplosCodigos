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
public class Exercicio4 {
    //Calculadora das 4 operações
    public static void main(String[] args) {
        int opcao;
        float num1, num2, resultado = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(
                "Selecione a operação:\n\n" +
                "1 - Soma;\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão");
        opcao = scanner.nextInt();
        
        if(opcao > 4){
            System.out.print("Opção inexistente nesta calculadora!");
            System.exit(0);
        }
        
        System.out.println("informe o primeiro número: ");
        num1 = scanner.nextFloat();
        
        System.out.println("informe o segundo número: ");
        num2 = scanner.nextFloat();
        
        if(opcao == 1){
            resultado = num1 + num2;
        }else if(opcao == 2){
            resultado = num1 - num2;
        }else if(opcao == 3){
            resultado = num1 * num2;
        }else if(opcao == 4){
            resultado = num1 / num2;
        }
        
        System.out.println("Resultado: " + resultado);
    }
}
