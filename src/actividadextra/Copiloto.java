/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que crea un copiloto y hereda de Persona
 * @author alumno
 */
public class Copiloto extends Persona{
    private boolean estaDormido, usaTelefono;
    private String aplicacion;
    /**
     * Metodo constructor vacio
     */
    public Copiloto() {
    }
    /**
     * Metodo constructor con inicializacion de variables
     * @param estaDormido Variable tipo booleano que te dice si esta dormido
     * @param usaTelefono   Variable tipo booleana que te dice si esta usando el telefono
     * @param aplicacion Variable tipo String que te dice que aplicacion esta usando para guiar al piloto
     * @param mascota variable tipo mascota que contiene todos los datos yun objeto mascota
     * @param nombre variable tipo string que tiene el nombre del copiloto 
     * @param edad variable tipo entero que tiene la edad del copiloto
     */
    public Copiloto(boolean estaDormido, boolean usaTelefono, String aplicacion, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.estaDormido = estaDormido;
        this.usaTelefono = usaTelefono;
        this.aplicacion = aplicacion;
    }
    public boolean isEstaDormido() {
        return estaDormido;
    }

    public void setEstaDormido(boolean estaDormido) {
        this.estaDormido = estaDormido;
    }

    public boolean isUsaTelefono() {
        return usaTelefono;
    }

    public void setUsaTelefono(boolean usaTelefono) {
        this.usaTelefono = usaTelefono;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }
    /**
     * Metodo que resive un string que tiene el nombre de la aplicacion y guia al piloto con la aplicacion que se envio
     * @param aplicacion 
     */
    public void usarGPS(String aplicacion){
        System.out.println("Esta guiando al piloto con la aplicación "+ aplicacion);
    }
    /**
     * Metoto que despierta al piloto
     */
    public void mantenerDespiertoAlPiloto(){
        System.out.println("No te duermas piloto");
    }
    /**
     * Metodo que avisa que hay un borracho
     */
    public void avisarAlPiloto(){
        System.out.println("Cuidado ese viene borracho");
    }
    /**
     * Metodo que te da todas las variables de esta clase y ademas las de un objeto llamado Persona
     * @return Atributos del copiloto
     */
    @Override
    public String toString() {
        return super.toString()+"Copiloto{" + "estaDormido=" + estaDormido + ", usaTelefono=" + usaTelefono + ", aplicacion=" + aplicacion + '}';
    }
    
}
