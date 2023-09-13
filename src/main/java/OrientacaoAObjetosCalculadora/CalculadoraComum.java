/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacaoAObjetosCalculadora;

/**
 *
 * @author 10156
 */
public class CalculadoraComum {
    public float somar(float a, float b){
        return a + b;
    }
    
    public float subtrair(float a, float b){
        return a - b;
    }
    
    public float multiplicar(float a, float b){
        return a * b;
    }
    
    public float dividir(float a, float b){
        if(b > 0){
            return a / b;
        }else{
            System.err.println("Erro: divisão por zero!");
            return Float.NaN;
        }
    }
}
