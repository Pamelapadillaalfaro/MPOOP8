/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *Clase que crea un triangulo
 * @author alumno
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gamma;
    private float a,b,c; 
    private  float base, altura;
    /**
     * Constructor vacío
     */
    public Triangulo() {
    }
    //Solo base y altura
    /**
     * Constructor con atributos
     * @param base Valor de la base del triangulo
     * @param altura Valor de la altura del triangulo
     */
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    //Todo
    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public int getGamma() {
        return gamma;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    //Solo  la base y la altura
    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    @Override
    /**
     * Método que calcula el perimetro del triangulo
     * @return Valor del perimetro del triangulo
     */
    public float perimetro(){
        return a+b+c;
    }
    /**
     * Método que calcula el área del triangulo
     * @return Valor del área del triangulo
     */
    @Override
    public float area(){
        return base*altura;
    }
    /**
     * Método que imprime los atributos del triangulo
     * @return Atributos del triangulo
     */
    @Override
    public String toString() {
        return super.toString()+"Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
