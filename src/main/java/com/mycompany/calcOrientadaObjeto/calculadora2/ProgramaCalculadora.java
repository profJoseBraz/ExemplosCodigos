/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcOrientadaObjeto.calculadora2;

import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        float num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número: ");
        float num2 = scanner.nextFloat();
        
        float soma = calculadora.somar(num1, num2);
        float sub  = calculadora.subtrair(num1, num2);
        float mult = calculadora.multiplicar(num1, num2);
        float div  = calculadora.dividir(num1, num2);
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);
        System.out.println("-----------------------------------------------");
        System.out.println("Agora, informe um número para saber a raiz quadrada: ");
        Double numRq = scanner.nextDouble();
        Double rq  = cc.raizQuadrada(numRq);
        System.out.println("Raiz quadrada de " + numRq + " é: " + rq);
        System.out.println("-----------------------------------------------");
        System.out.println("Informe um número: ");
        Double num = scanner.nextDouble();
        System.out.println("Informe uma potência: ");
        Double numPot = scanner.nextDouble();
        Double pow = cc.potencia(num, numPot);
        System.out.println(num + " elevado a " + numPot + " é: " + pow);
    }
}
