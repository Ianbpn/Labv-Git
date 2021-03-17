package model;

import Interface.Beber;
import Interface.Orinar;

public abstract class Humano{
    private String Nombre;
    private Integer Edad;
    private Integer Peso;
    private Orinar orinar;
    private Beber beber;

    public Humano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        Nombre = nombre;
        Edad = edad;
        Peso = peso;
        this.orinar = orinar;
        this.beber = beber;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer peso) {
        Peso = peso;
    }

    public Orinar getOrinar() {
        return orinar;
    }

    public void setOrinar(Orinar orinar) {
        this.orinar = orinar;
    }

    public Beber getBeber() {
        return beber;
    }

    public void setBeber(Beber beber) {
        this.beber = beber;
    }
}
