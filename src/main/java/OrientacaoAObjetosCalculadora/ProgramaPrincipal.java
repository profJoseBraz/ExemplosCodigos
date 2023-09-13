/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacaoAObjetosCalculadora;

/**
 *
 * @author 10156
 */
public class ProgramaPrincipal {
    public static void main(String args[]){
        CalculadoraComum calculadoraComum = new CalculadoraComum();
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
        
        System.out.println(calculadoraCientifica.somar(10, 10));
    }
}
