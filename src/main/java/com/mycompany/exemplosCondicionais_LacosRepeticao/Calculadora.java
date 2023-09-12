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
public class Calculadora {
    public static void main(String args[]){
        //Declaração da variável so tipo Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Variável referente à opção da calculadora
        int opcao;
        
        //Declaração das variáveis que receberão os números para serem calculados
        float num1 = 0, num2 = 0, resultado = 0;
        
        Boolean continuar = true;
        
        String opcaoEscolha;
        
        while(continuar){
            //Menu da calculadora
            System.out.println("----------------------------------------");
            System.out.println("Calculadora das quatro operações básicas");
            System.out.println("----------------------------------------");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("----------------------------------------");

            //Entrada da opção
            opcao = entrada.nextInt();

            //Condicionais referente à opção selecionada
            if(opcao == 1){//Soma
                //Entrada do primeiro valor a ser calculado
                System.out.println("Informe o primeiro número: ");
                num1 = entrada.nextFloat();

                //Entrada do segundo valor a ser calculado
                System.out.println("Informe o segundo número: ");
                num2 = entrada.nextFloat();
                
                resultado = num1 + num2;
            }else if(opcao == 2){//Subtração
                //Entrada do primeiro valor a ser calculado
                System.out.println("Informe o primeiro número: ");
                num1 = entrada.nextFloat();

                //Entrada do segundo valor a ser calculado
                System.out.println("Informe o segundo número: ");
                num2 = entrada.nextFloat();
                
                resultado = num1 - num2;
            }else if(opcao == 3){//Multiplicação
                //Entrada do primeiro valor a ser calculado
                System.out.println("Informe o primeiro número: ");
                num1 = entrada.nextFloat();

                //Entrada do segundo valor a ser calculado
                System.out.println("Informe o segundo número: ");
                num2 = entrada.nextFloat();
                
                resultado = num1 * num2;
            }else if(opcao == 4){//Divisão
                //Entrada do primeiro valor a ser calculado
                System.out.println("Informe o primeiro número: ");
                num1 = entrada.nextFloat();

                //Entrada do segundo valor a ser calculado
                System.out.println("Informe o segundo número: ");
                num2 = entrada.nextFloat();
                
                resultado = num1 / num2;
            }else{
                System.out.println("Opção inexistente!");
                resultado = 0;
            }

            System.out.println("----------------------------------------");
            System.out.println("RESULTADO");
            System.out.println("----------------------------------------");
            System.out.println(resultado);
            
            System.out.println("----------------------------------------");
            System.out.println("Deseja continuar? (S/N)");
            opcaoEscolha = entrada.next();
            System.out.println("----------------------------------------");
        
            if(opcaoEscolha.equals("S") || opcaoEscolha.equals("s")){
                continuar = true;
            }else{
                continuar = false;
            }
        }
    }
}
