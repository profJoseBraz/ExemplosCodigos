/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author 10156
 */
public class ProgramaPrincipal {
    public static void main(String args[]){
        CalculadoraComum calculadoraComum = new CalculadoraComum();
        CalculadoraMedia calculadoraMedia = new CalculadoraMedia();
        
        System.out.println(calculadoraMedia.mediaPonderada(10, 10, 1, 1));
    }
}
