/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaVendas_2_0;

import com.mycompany.sistemaVendas_2_0.ferramentas.Constantes;
import com.mycompany.sistemaVendas_2_0.modelo.Computador;
import com.mycompany.sistemaVendas_2_0.modelo.VideoGame;
import com.mycompany.sistemaVendas_2_0.visao.VisaoComputador;
import com.mycompany.sistemaVendas_2_0.visao.VisaoVideoGame;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class SistemaVendas_2_0 {
    public static ArrayList<Object> produtos = new ArrayList<>();
    
    public static void main(String args[]){
        
//        VideoGame videoGame = new VideoGame();
//        
//        videoGame.setNome("A");
//        videoGame.setPreco(2500.0);
//        videoGame.setPlataforma("Playstation 5");
//        
//        produtos.add(videoGame);
//         
//        Object o = produtos.get(0);
//        
//        videoGame = (VideoGame) o;
//        
//        System.out.println(videoGame.getNome());
//        System.out.println(videoGame.getPreco());
//        System.out.println(videoGame.getPlataforma());
//        System.out.println((VideoGame) produtos.get(0).getNome());

        while(true){
            System.out.println("==========SISTEMA DE VENDAS 2.0==========");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Alterar produto");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Listar produto");
            System.out.println("==========================================");
            int opcaoMenu = new Scanner(System.in).nextInt();
            
            if(opcaoMenu == Constantes.CADASTRAR){
                cadastrar();
            }else if(opcaoMenu == Constantes.LISTAR){
                listar(produtos);
            }
        }
    }
    
    public static void cadastrar(){
        System.out.println("==========CADASTRAR PRODUTO==========");        
        System.out.println("Qual produto deseja cadastrar?");
        System.out.println("1 - Video Game");
        System.out.println("2 - Computador");
        int opcaoProduto = new Scanner(System.in).nextInt();
        
        if(opcaoProduto == 1){
            produtos.add(VisaoVideoGame.menuCadastro());
        }else if(opcaoProduto == 2){
//            produtos.add(VisaoComputador.menuCadastro())
        }
    }
    
    public static void listar(ArrayList<Object> produtos){
        for(int i = 0; i < produtos.size(); i++){
            Object object = produtos.get(i);
            
            if(object instanceof VideoGame){
                VideoGame videoGame = (VideoGame) object;
                System.out.println(videoGame.toString());
            }else if(object instanceof Computador){
                Computador computador = (Computador) object;
                System.out.println(computador.toString());
            }
        }
    }
}
