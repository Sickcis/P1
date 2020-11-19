//Clase para crear el objeto plano (POJO) con anotaciones
package org.dis;

public class GolfPlayer {
    private String posicion;
    private String nombre;
    private String apellido;
    private String pais;
    private String edad;


    public GolfPlayer() {
        this.posicion = null;
        this.nombre = null;
        this.apellido = null;
        this.pais = null;
        this.edad = null;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "GolfPlayer{" +
                "posicion='" + posicion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pais='" + pais + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}