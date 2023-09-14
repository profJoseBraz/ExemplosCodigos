/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaVendas_2_0.visao;

import com.mycompany.sistemaVendas_2_0.modelo.Computador;
import com.mycompany.sistemaVendas_2_0.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class VisaoComputador {
    public static Computador menuCadastro(){
        Computador computador = new Computador();
        
        System.out.println("Nome: ");
        computador.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço: ");
        computador.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("Quantidade de memória RAM: ");
        computador.setMemoriaRam(new Scanner(System.in).nextDouble());
        System.out.println("Processador: ");
        computador.setMemoriaRam(new Scanner(System.in).nextDouble());
        System.out.println("=====================================");
        
        return computador;
    }
}
