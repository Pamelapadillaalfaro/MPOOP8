/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que crea un gato
 * @author alumno
 */
public class Gato extends Mascota{
    /**
     * Constructor vacío
     */
    public Gato() {
    }
    /**
     * Constructor con atributos
     * @param color Color del gato
     * @param raza Raza del gato
     * @param colorOjos Color de ojos del gato
     * @param nombre Nombre del gato
     * @param edad Edad del gato
     */
    public Gato(String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
    }
    /**
     * Método que hace que el gato rasguñe
     */
    public void rasgunar(){
        System.out.println("Rasguñando");
    }
    /**
     * Método que hace que el gato trepe
     */
    public void trepar(){
        System.out.println("Estoy trepando");
    }
    /**
     * Método que imprime los atributos del gato
     * @return Atributos del gato
     */
    @Override
    public String toString() {
        return super.toString()+"Gato{" + '}';
    }
    
}
