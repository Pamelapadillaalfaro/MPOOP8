/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadextra;

/**
 *Clase que crea un piloto y hereda de persona
 * @author alumno
 */
public class Piloto extends Persona{
    private int aniosExperiencia;
    private String tipoLicencia;
    private boolean tieneTargetaCirculacion;
/**
 * Metodo contructor vacio
 */
    public Piloto() {
    }
/**
 * Metodo constructor con inicializacion de variables
 * @param aniosExperiencia variable tipo entero que contiene los años de experiencia del piloto
 * @param tipoLicencia variable tipo string y contiene el tipo de licencia que tiene el piloto
 * @param tieneTargetaCirculacion variable tipo booleano y es para saber si tiene targeta de sirculacion
 * @param mascota variable tipo mascota que contiene todos los datos yun objeto mascota
 * @param nombre variable tipo string que tiene el nombre del piloto 
 * @param edad variable tipo entero que tiene la edad del piloto
 */
    public Piloto(int aniosExperiencia, String tipoLicencia, boolean tieneTargetaCirculacion, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.tipoLicencia = tipoLicencia;
        this.tieneTargetaCirculacion = tieneTargetaCirculacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public boolean isTieneTargetaCirculacion() {
        return tieneTargetaCirculacion;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public void setTieneTargetaCirculacion(boolean tieneTargetaCirculacion) {
        this.tieneTargetaCirculacion = tieneTargetaCirculacion;
    }
    /**
     * Este metodo nos dice que esta manejando el piloto
     */
    public void manejar(){
        System.out.println("Estoy manejando");
    }
    /**
     * Metodo que te dice que se esta estacionando
     */
    public void estacionar(){
        System.out.println("Estacionarse");
    }
    /**
     * Te dice que esta viendo el retrovisor
     */
    public void espejear(){
        System.out.println("Estoy viendo el retrovisor");
    }
    /**
     * Metodo que te da todas las variables de esta clase y ademas las de un objeto llamado Persona
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Piloto{" + "aniosExperiencia=" + aniosExperiencia + ", tipoLicencia=" + tipoLicencia + ", tieneTargetaCirculacion=" + tieneTargetaCirculacion + '}';
    }
    
}
