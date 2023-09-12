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
public class Exercicio16 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        String nomeAtleta;
        int idadeAtleta;
        
        System.out.println("Nome do atleta: ");
        nomeAtleta = scanner.nextLine();
        
        System.out.println("Idade do atleta: ");
        idadeAtleta = scanner.nextInt();
        
        if(idadeAtleta >= 5 && idadeAtleta <= 7){
            System.out.println("O atleta " + nomeAtleta + " está na categoria: Infantil A");
        }else if(idadeAtleta >= 8 && idadeAtleta <= 10){
            System.out.println("O atleta " + nomeAtleta + " está na categoria: Infantil B");
        }else if(idadeAtleta >= 11 && idadeAtleta <= 13){
            System.out.println("O atleta " + nomeAtleta + " está na categoria: Juvenil A");
        }else if(idadeAtleta >= 14 && idadeAtleta <= 17){
            System.out.println("O atleta " + nomeAtleta + " está na categoria: Juvenil A");
        }else if(idadeAtleta >= 18){
            System.out.println("O atleta " + nomeAtleta + " está na categoria: Adulto");
        }
    }
}
