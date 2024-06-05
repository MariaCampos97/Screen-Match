package principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        miPelicula.evalua(8);

        Serie casaDragon = new Serie("La casa del dragón", 2022);
        miPelicula.evalua(6);

        var peliculaDeBruno = new Pelicula("El señor de los añillos",2001);
        miPelicula.evalua(5);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add (casaDragon);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula) {            System.out.println(pelicula.getClasificacion());
                System.out.println(pelicula.getClasificacion());
            }
        }


    }
}
