/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaVendas_2_0;

import com.mycompany.sistemaVendas_2_0.controle.ControleSistema;
import com.mycompany.sistemaVendas_2_0.ferramentas.Constantes;
import com.mycompany.sistemaVendas_2_0.modelo.Computador;
import com.mycompany.sistemaVendas_2_0.modelo.VideoGame;
import com.mycompany.sistemaVendas_2_0.visao.VisaoComputador;
import com.mycompany.sistemaVendas_2_0.visao.VisaoMenu;
import com.mycompany.sistemaVendas_2_0.visao.VisaoVideoGame;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class SistemaVendas_2_0 {
    public static void main(String args[]){
        while(true){
            int opcaoMenu = VisaoMenu.menuPrincipal();

            if(opcaoMenu == Constantes.CADASTRAR){
                ControleSistema.cadastrar();
            }else if(opcaoMenu == Constantes.ALTERAR){
                ControleSistema.alterar(VisaoMenu.menuAlteracaoProdutoOpcao());
            }else if(opcaoMenu == Constantes.LISTAR){
                ControleSistema.listar(ControleSistema.produtos);
            }
        }
    }
}
