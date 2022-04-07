/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

import java.util.ArrayList;

/**
 *Clase que crea un carro
 * @author alumno
 */
public class Carro {

    private String tipoDeMotor, color, marca;
    ArrayList <SerVivo> pasajeros;
    /**
     * Constructor vacío
     */
    public Carro() {
        this.pasajeros = new ArrayList();
    }
    /**
     * Constructor con atributos
     * @param tipoDeMotor variable tipo string que contiene el tipo de motor de carro
     * @param color Variable tipo string que contiene el color del carro
     * @param marca variable tipo string que contiene la marca del carro
     */
    public Carro(String tipoDeMotor, String color, String marca) {
        this.tipoDeMotor = tipoDeMotor;
        this.color = color;
        this.marca = marca;
        this.pasajeros = new ArrayList();
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<SerVivo> getPasajeros() {
        return pasajeros;
        
    }
    /**
     * Metodo que agrega un pasajero y resibe como parametro un SerVivo
     * @param pasajero 
     */
    public void setPasajeros(SerVivo pasajero) {
        this.pasajeros.add(pasajero);
    }
    /**
     * Metodo que ordena a los pasajeros conforme a su clase, los que aparecen primero son los que se sientan adelante
     * contiene dos arreglos, uno temporal y uno que es al que al final se le asignara a los pasajeros
     */
    public void ordenar(){
        int i=0;
        ArrayList<SerVivo> nuevos=new ArrayList(),nuevosTemporal=new ArrayList();
        nuevosTemporal.addAll(pasajeros);
        for (SerVivo nuevo : pasajeros) {
            if (nuevo instanceof Persona){
                if (nuevo instanceof Piloto){
                    nuevos.add(0,nuevo);
                    nuevosTemporal.remove(i);
                    nuevosTemporal.add(0,nuevos.get(0));
                }else if(nuevo instanceof Copiloto){
                    nuevos.add(1,nuevo);
                    nuevosTemporal.remove(i);
                    nuevosTemporal.add(1,nuevos.get(1));
                }
                else{
                nuevos.add(2,nuevo);
                }
            }
            else{
            nuevos.add(nuevo);
            }
        i++;
        }
        pasajeros.clear();
        pasajeros.addAll(nuevos);        
    }
    /**
     * Metodo que acelera el coche
     */
    public void acelerar(){
        System.out.println("Estoy acelerando");
    }
    /**
     * Metdo que frena el coche
     */
    public void frenar(){
        System.out.println("Estoy frenando");
    }
    /**
     * Metodo que prende las luces
     */
    public void prenderLuces(){
        System.out.println("Luces prendidas");
    }
    /**
     * Metodo que me da el nombre y lugar del pasajero
     */
    public void dameALosPasajeros(){
        int i=0;
        for (SerVivo pasajero : pasajeros) {
           System.out.println("Pasajero"+i+": "+this.pasajeros.get(i).getNombre());
           i++;
        }
    }
    /**
     * Metodo que te da todas las variables de esta clase con su nombre de cada variable
     * @return Atributos del carro
     */
    
    @Override
    public String toString() {
        return super.toString()+"Carro{" + "tipoDeMotor=" + tipoDeMotor + ", color=" + color + ", marca=" + marca + ", pasajeros=" + pasajeros + '}';
    }
}