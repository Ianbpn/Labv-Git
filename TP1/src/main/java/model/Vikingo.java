package model;

import Interface.Beber;
import Interface.Orinar;

public class Vikingo extends Humano {
    private Integer BebedorProfesional;

    public Vikingo(String nombre, Integer edad, Integer peso, Integer bebedorProfesional) {
        super(nombre, edad, peso, new OrinarVikingo(), new BeberVikingo());
        BebedorProfesional = bebedorProfesional;
    }

    public Integer getBebedorProfesional() {
        return BebedorProfesional;
    }

    public void setBebedorProfesional(Integer bebedorProfesional) {
        BebedorProfesional = bebedorProfesional;
    }

    public void Beber(){
        super.getBeber().Beber();
    }
    public void Orinar(){
        super.getOrinar().Orinar();
    }
}
