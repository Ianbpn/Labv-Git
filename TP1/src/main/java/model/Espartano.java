package model;

import Interface.Beber;
import Interface.Orinar;

public class Espartano extends Humano{
    private Integer toleranciaExtra;

    public Espartano(String nombre, Integer edad, Integer peso, Integer toleranciaExtra) {
        super(nombre, edad, peso, new OrinarEspartano(), new BeberEspartano());
        this.toleranciaExtra = toleranciaExtra;
    }

    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    public void Beber(){
        super.getBeber().Beber();
    }
    public void Orinar(){
        super.getOrinar().Orinar();
    }
}
