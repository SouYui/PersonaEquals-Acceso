/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

/**
 *
 * @author Sou Akiyama
 */
 class PersonaDefault {
    String nombre;
    String sexo;
    String colorFavorito;
    int fechaNacimiento;

    PersonaDefault() {
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

     String getSexo() {
        return sexo;
    }

     void setSexo(String sexo) {
        this.sexo = sexo;
    }

     String getColorFavorito() {
        return colorFavorito;
    }

     void setColorFavorito(String colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

     int getFechaNacimiento() {
        return fechaNacimiento;
    }

     void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
