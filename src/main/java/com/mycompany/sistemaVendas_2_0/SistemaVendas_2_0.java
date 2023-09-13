/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaVendas_2_0;

import java.util.ArrayList;

/**
 *
 * @author 10156
 */
public class SistemaVendas_2_0 {
    public static void main(String args[]){
        ArrayList<Object> produtos = new ArrayList<>();
        
        VideoGame videoGame = new VideoGame();
        
        videoGame.setNome("A");
        videoGame.setPreco(2500.0);
        videoGame.setPlataforma("Playstation 5");
        
        produtos.add(videoGame);
         
        Object o = produtos.get(0);
        
        videoGame = (VideoGame) o;
        
        System.out.println(videoGame.getNome());
        System.out.println(videoGame.getPreco());
        System.out.println(videoGame.getPlataforma());
//        System.out.println((VideoGame) produtos.get(0).getNome());
    }
}
