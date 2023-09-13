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
    private float resultado;

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public void somar(float a, float b){
        setResultado(a + b);
    }
    
    public void subtrair(float a, float b){
        setResultado(a - b);
    }
    
    public void multiplicar(float a, float b){
        setResultado(a * b);
    }
    
    public void dividir(float a, float b){
        if(b > 0){
            setResultado(a / b);
        }else{
            System.err.println("Erro: divisão por zero!");
            setResultado(Float.NaN);
        }
    }
}
