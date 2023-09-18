/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_Exercicio2_Resolvida_Com_Alunos;

import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class BuscaElemento {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int valorBusca, posicao = 0;
        
        int[] elementos = new int[10];
        
        elementos[0] = 15;
        elementos[1] = 254;
        elementos[2] = 24;
        elementos[3] = 97;
        elementos[4] = 102;
        elementos[5] = 67;
        elementos[6] = 34;
        elementos[7] = 39;
        elementos[8] = 8;
        elementos[9] = 3;
        
        boolean encontrado = false;
        
        System.out.println("Qual valor deseja encontrar no vetor?");
        valorBusca = scanner.nextInt();
        
        for(int i = 0; i < elementos.length; i++){
            if(elementos[i] == valorBusca){
                encontrado = true;
                posicao = i;
                break;
            }
        }
        
        if(encontrado){
            System.out.println("O valor " + valorBusca + " existe no vetor e está na posição " + posicao);
        }else{
            System.out.println("O valor " + valorBusca + " NÃO existe no vetor!");
        }
    }
}
