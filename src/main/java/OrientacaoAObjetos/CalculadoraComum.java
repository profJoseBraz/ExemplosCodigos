/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author 10156
 */
public class CalculadoraComum {
    public int somar(int a, int b){
        return a + b;
    }
    
    public int subtrair(int a, int b){
        return a - b;
    }
    
    public int multiplicar(int a, int b){
        return a * b;
    }
    
    public double dividir(double a, double b){
        if(b > 0){
            return a / b;
        }else{
            System.err.println("Erro: divisão por zero!");
            return Double.NaN;
        }
    }
}
