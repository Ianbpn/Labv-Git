import model.Humano;
import model.Espartano;
import model.Vikingo;

import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {

        List<Vikingo> equipoDeVikingos = new ArrayList<>();
        List<Espartano> equipoDeEspartanos = new ArrayList<>();

        /*equipoDeEspartanos.add(new Espartano("Maximus",35,96,10));
        equipoDeEspartanos.add(new Espartano("Constantino",30,88,7));
        equipoDeVikingos.add(new Vikingo("Raknar",27,106,1));
        equipoDeVikingos.add(new Vikingo("Toraq",32,136,5));*/

       Espartano espartano= new Espartano("Maximus",35,96,10);
       Vikingo vikingo= new Vikingo("Toraq",32,136,5);

       vikingo.Beber();
       espartano.Orinar();
    }
}
