/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosVetores;

import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class BuscaElementoVetor {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int valorBusca;
        
        int[] valores = new int[5];
        
        valores[0] = 15;
        valores[1] = 5;
        valores[2] = 675;
        valores[3] = 134;
        valores[4] = 78;
        
        boolean encontrado = false;
        
        System.out.println("----------LISTA----------");
        for(int i = 0; i < valores.length; i++){
            System.out.println(i + " | " + valores[i]);
        }
        
        System.out.println("Qual valor deseja encontrar no vetor?");
        valorBusca = scanner.nextInt();
        
        for(int i = 0; i < valores.length; i++){
            if(valores[i] == valorBusca){
                encontrado = true;
                System.out.println("O valor " + valorBusca + " está na lista, na posição " + i);
                break;
            }
        }
        
        if(!encontrado){
            System.out.println("O valor " + valorBusca + " não está na lista");
        }
    }
}
