/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author alumno
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gamma;
    private float a,b,c; 
    private  float base, altura;

    public Triangulo() {
    }
    //Solo base y altura
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
    public float perimetro(){
        return a+b+c;
    }
    @Override
    public float area(){
        return base*altura;
    }
    @Override
    public String toString() {
        return super.toString()+"Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
