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
public class ContagemRegressiva {
    //Contagem inversa
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int valor;
        
        System.out.println("Insira o valor máximo: ");
        valor = scanner.nextInt();
        
        while(valor >= 0){
            System.out.println(valor);
            valor--;
        }
        
        System.out.println("Processo finalizado!");
    }
}
