/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *Clase que crea un cuadrilatero
 * @author alumno
 */
public class Cuadrilatero extends Poligono{
    private int alfa,beta;
    private float a, b;
    private float base, altura;
    /**
     * Constructor vacío
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor con parametros
     * @param base base del cuadrilatero
     * @param altura altura del cuadrilatero
     */
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    @Override
    /**
     * Método que regresa el valor del perimetro del cuadrilatero
     */
    public float perimetro(){
        return 2*a+2*b;
    }
    /**
     *  Método que calcula el valor del área del cuadrilatero
     * @return El valor del área
     */
    public float area(){
        return base*altura;
    }
    /**
     * Método que imprime los atributos del cuadrilatero
     * @return Atributos del cuadrilatero
     */
    @Override
    public String toString() {
        return super.toString()+"Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
