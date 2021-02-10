/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.util.Objects;

/**
 *
 * @author Sou Akiyama
 */
public class Persona {
    private String nombre;
    private String sexo;
    private String colorFavorito;
    private int fechaNacimiento;
    
    // Public; Protected; Private; Default

    public Persona() {
    }

    public Persona(String nombre, String sexo, String colorFavorito, int fechaNacimiento) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.colorFavorito = colorFavorito;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColorFavorito() {
        return colorFavorito;
    }

    public void setColorFavorito(String colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", colorFavorito=" + colorFavorito + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Persona{nombre=").append(nombre);
//        sb.append(", sexo=").append(sexo);
//        sb.append(", colorFavorito=").append(colorFavorito);
//        sb.append(", fechaNacimiento=").append(fechaNacimiento);
//        sb.append('}');
//        return sb.toString();
//    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.sexo);
        hash = 59 * hash + Objects.hashCode(this.colorFavorito);
        hash = 59 * hash + this.fechaNacimiento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.fechaNacimiento != other.fechaNacimiento) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.colorFavorito, other.colorFavorito)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
