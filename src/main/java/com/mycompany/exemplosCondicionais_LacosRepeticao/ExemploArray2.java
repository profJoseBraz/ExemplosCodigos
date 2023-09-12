/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplosCondicionais_LacosRepeticao;

import java.util.ArrayList;

/**
 *
 * @author 10156
 */
public class ExemploArray2 {
    public static void main(String args[]){
        ArrayList listaNumeros = new ArrayList();
        
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        
        for(int i = 0; i < listaNumeros.size(); i++){
            System.out.println(listaNumeros.get(i));
        }
    }
}
