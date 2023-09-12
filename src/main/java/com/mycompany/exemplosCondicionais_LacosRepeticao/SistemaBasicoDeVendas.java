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
public class SistemaBasicoDeVendas {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int codProduto, quantidadeProduto;
        float valorTotalProd;
        
        float valorProd1 = (float) 299.00;
        float valorProd2 = (float) 250.00;
        float valorProd3 = (float) 350.00;
        float valorProd4 = (float) 95.00;
        float valorProd5 = (float) 95.50;
        
        String prod1 = "Resident Evil 4 Remake";
        String prod2 = "Silent Hill 2 Remake";
        String prod3 = "FIFA 2024";
        String prod4 = "Need For Speed Unbound";
        String prod5 = "Red Dead Redemption 2";
        
        System.out.println("-------------------PRODUTOS-------------------");
        System.out.println("1 | "+ prod1 +" | Valor: R$ "+ valorProd1);
        System.out.println("2 | "+ prod2 +" | Valor: R$ "+ valorProd2);
        System.out.println("3 | "+ prod3 +" | Valor: R$ "+ valorProd3);
        System.out.println("4 | "+ prod4 +" | Valor: R$ "+ valorProd4);
        System.out.println("5 | "+ prod5 +" | Valor: R$ "+ valorProd5);
        
        System.out.println("-------------------ESCOLHA UM PRODUTO-------------------");
        System.out.println("Escolha um produto informando o seu código: ");
        codProduto = scanner.nextInt();
        
        if(codProduto == 1){
            System.out.println("Informe a quantidade desejada para "+ prod1 +": ");
            quantidadeProduto = scanner.nextInt();
            
            valorTotalProd = quantidadeProduto * valorProd1;
            
            System.out.println("Total da compra para o produto "+ prod1 + ": R$" + valorTotalProd);
        }else if(codProduto == 2){
            System.out.println("Informe a quantidade desejada para "+ prod2 +": ");
            quantidadeProduto = scanner.nextInt();
            
            valorTotalProd = quantidadeProduto * valorProd2;
            
            System.out.println("Total da compra para o produto "+ prod2 + ": R$" + valorTotalProd);
        }else if(codProduto == 3){
            System.out.println("Informe a quantidade desejada para "+ prod3 +": ");
            quantidadeProduto = scanner.nextInt();
            
            valorTotalProd = quantidadeProduto * valorProd3;
            
            System.out.println("Total da compra para o produto "+ prod3 + ": R$" + valorTotalProd);
        }else if(codProduto == 4){
            System.out.println("Informe a quantidade desejada para "+ prod4 +": ");
            quantidadeProduto = scanner.nextInt();
            
            valorTotalProd = quantidadeProduto * valorProd4;
            
            System.out.println("Total da compra para o produto "+ prod4 + ": R$" + valorTotalProd);
        }else if(codProduto == 5){
            System.out.println("Informe a quantidade desejada para  "+ prod5 +": ");
            quantidadeProduto = scanner.nextInt();
            
            valorTotalProd = quantidadeProduto * valorProd5;
            
            System.out.println("Total da compra para o produto "+ prod5 + ": R$" + valorTotalProd);
        }
    }
}
