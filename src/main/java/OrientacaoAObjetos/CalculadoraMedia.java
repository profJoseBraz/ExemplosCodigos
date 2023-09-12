/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author 10156
 */
public class CalculadoraMedia extends CalculadoraComum{
    public double mediaAritmetica(double a, double b){
        return (a + b) / 2;
    }
    
    public double mediaPonderada(double a, double b, double pesoA, double pesoB){
        return ((a * pesoA) + (b * pesoB)) / (pesoA + pesoB);
    }
    
    public float mediaPonderada(float a, float b, float pesoA, float pesoB){
        return ((a * pesoA) + (b * pesoB)) / (pesoA + pesoB);
    }
}
