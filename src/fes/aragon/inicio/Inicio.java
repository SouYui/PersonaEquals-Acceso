/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.Persona;
import fes.aragon.codigo.PersonaProtected;

/**
 *
 * @author luisangelcuriel
 */
public class Inicio {

    public static void main(String[] args) {
        Persona personaUno = new Persona();
        Persona personaDos = new Persona("Alfredo", "Masculino", "Amarillo", 21082000);
        
        System.out.println("personaUno = " + personaUno);
        System.out.println("personaDos = " + personaDos);
        
        /* Comparación en Memoria
        System.out.println("personaUno = " + personaUno);
        System.out.println("personaDos = " + personaDos);
        if (personaUno == personaDos) {
            System.out.println("Es lo mismo"); // Referencia en Memoria
        } else {
            System.out.println("No es lo mismo");
        } */
        
        
        /* Comparación de objetos
        if (personaUno.equals(personaDos)) {
            System.out.println("El valor es el mismo");
        } else {
            System.out.println("El valor no es el mismo");
        }
        
        if (personaUno.hashCode() == personaDos.hashCode()) {
            System.out.println("El valor es el mismo: " + personaUno.hashCode());
        } else {
            System.out.println("El valor no es el mismo");
        }*/
        
        //_____________________________________________________________________
        PersonaProtected personaProtected;
        //personaProtected.setNombre("Panchito");
        
        
    }
}
