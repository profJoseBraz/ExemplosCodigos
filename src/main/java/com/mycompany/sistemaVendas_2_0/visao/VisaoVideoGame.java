/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaVendas_2_0.visao;

import com.mycompany.sistemaVendas_2_0.modelo.VideoGame;
import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class VisaoVideoGame {
    public static VideoGame menuCadastroVideoGame(){
        VideoGame videoGame = new VideoGame();
        
        System.out.println("Nome: ");
        videoGame.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço: ");
        videoGame.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("Plataforma: ");
        videoGame.setPlataforma(new Scanner(System.in).nextLine());
        System.out.println("=====================================");
        
        return videoGame;
    }
}
