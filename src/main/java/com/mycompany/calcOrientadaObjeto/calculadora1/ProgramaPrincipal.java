/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcOrientadaObjeto.calculadora1;

/**
 *
 * @author 10156
 */
public class ProgramaPrincipal {
    public static void main(String args[]){
        CalculadoraComum calculadoraComum = new CalculadoraComum();
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
        
        calculadoraCientifica.subtrair(10, 3);
        System.out.println(calculadoraCientifica.getResultado());
    }
}
