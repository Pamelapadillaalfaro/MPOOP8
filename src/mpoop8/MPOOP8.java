/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop8;

import actividadextra.Carro;
import actividadextra.Copiloto;
import actividadextra.Gato;
import actividadextra.Perro;
import actividadextra.Persona;
import actividadextra.Piloto;
import figura.Cuadrilatero;
import figura.Poligono;
import figura.Triangulo;

/**
 *
 * @author alumno
 */
public class MPOOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poligono poligono=new Poligono();
        System.out.println(poligono);
        poligono=new Triangulo();
        System.out.println(poligono);
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        //Creando objetos de tipo objeto
        Object objeto= new Object();
        System.out.println(objeto);
        objeto =new Poligono();
        System.out.println(objeto);
        objeto=new Triangulo();
        System.out.println(objeto);
        
        getPoligono(new Triangulo());
        getPoligono(new Cuadrilatero());
        getPoligono(new Poligono());
        
        System.out.println("####Actividad extra######");
        Carro carro=new Carro("V8","Blanco","Hyundai");
        System.out.println(carro);
        Perro mascotaPiloto=new Perro(false, "Café", "Chihuahua", "Café claro", "Draco", 2);
        Piloto piloto =new Piloto(5, "A", true, mascotaPiloto, "Pedro", 38);
        carro.setPasajeros(piloto);
        carro.setPasajeros(mascotaPiloto);
        Gato mascotaCopiloto=new Gato("Gris", "Siames", "Verdes", "Pelusa", 5);
        Copiloto copiloto=new Copiloto(false, true, "Waze", mascotaCopiloto, "Juan", 27);
        carro.setPasajeros(copiloto);
        carro.setPasajeros(mascotaCopiloto);
        System.out.println("Impresión de carro");
        System.out.println(carro);
        System.out.println("Metodo dameALosPasajeros");
        carro.dameALosPasajeros();
        System.out.println("Ordenados");
        carro.ordenar();
        carro.dameALosPasajeros();
        System.out.println("Agregando pasajeros y mascotas");
        Perro perro1=new Perro(false, "negra", "no se sabe", "negros", "Ramita", 1);
        Persona persona1=new Persona(perro1,"Alan", 19);
        carro.setPasajeros(perro1);
        carro.setPasajeros(persona1);
        System.out.println("Pasajeros sin ordenar");
        carro.dameALosPasajeros();
        System.out.println("Ordenados");
        carro.ordenar();
        carro.dameALosPasajeros();
        
    }
    public static void getPoligono(Poligono pol){
        if(pol instanceof Triangulo) {
            System.out.println("El poligono es un triangulo");
        }else if(pol instanceof Cuadrilatero){
        System.out.println("El poligono es un cuadrilatero");
        }else{
                System.out.println("Es otra figura");
            }
    }
    //Coche con dos acientos delanteros y traseros 
    //Perro en caja de perro gato en caja de gato
}
