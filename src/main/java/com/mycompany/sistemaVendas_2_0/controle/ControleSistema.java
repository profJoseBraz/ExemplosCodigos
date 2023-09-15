/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaVendas_2_0.controle;

import com.mycompany.sistemaVendas_2_0.modelo.Computador;
import com.mycompany.sistemaVendas_2_0.modelo.VideoGame;
import com.mycompany.sistemaVendas_2_0.visao.VisaoComputador;
import com.mycompany.sistemaVendas_2_0.visao.VisaoMenu;
import com.mycompany.sistemaVendas_2_0.visao.VisaoVideoGame;
import java.util.ArrayList;

/**
 *
 * @author 10156
 */
public class ControleSistema {
    public static ArrayList<Object> produtos = new ArrayList<>();
    
    public static void cadastrar(){
        int opcaoProduto = VisaoMenu.menuEscolhaProduto();

        if(opcaoProduto == 1){
            produtos.add(VisaoVideoGame.menuCadastro());
        }else if(opcaoProduto == 2){
            produtos.add(VisaoComputador.menuCadastro());
        }
    }
    
    public static void alterar(int indiceProduto){
        indiceProduto = indiceProduto - 1;
        
        System.out.println(indiceProduto);

        Object object = ControleSistema.produtos.get(indiceProduto);
       
        if(object instanceof VideoGame){
            VideoGame videoGame = new VideoGame();
            videoGame = (VideoGame) object;
            
            System.out.println("alterando o produto: " + videoGame.toString());
            
            videoGame = (VideoGame) VisaoMenu.menuAlteracaoProdutoInformacoes(videoGame);
            ControleSistema.produtos.set(indiceProduto, videoGame);
        }else if(object instanceof Computador){
            Computador computador = new Computador();
            computador = (Computador) object;
            
            System.out.println("alterando o produto: " + computador.toString());
            
            computador = (Computador) VisaoMenu.menuAlteracaoProdutoInformacoes(computador);
            ControleSistema.produtos.set(indiceProduto, computador);
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
