/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacaoAObjetosCalculadora;

/**
 *
 * @author 10156
 */
public class CalculadoraCientifica extends CalculadoraComum{
    public Double raizQuadrada(Double a){
        return Math.sqrt(a);
    }
    
    public Double potencia(Double a, Double b){
        return Math.pow(a, b);
    }
}