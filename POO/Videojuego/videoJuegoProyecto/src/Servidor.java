import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class Servidor implements Servidor_Interfaz {
    private String nombre;
    private List<Personaje> personajes;

    // Importante interfaz comparator pdf, con un switch.

    public Servidor(String nombre) {
        this.nombre = nombre;
        this.personajes = new ArrayList<>();
        // this.personajes = new LinkedList<>(); Elegimos el tipo de lista

    }
    // Hay dos modos: Crear lista en app y pasarlo por parametro al servidor. )

    // o

    // desde el constructor de la clase "servidor" --> agregarPersona(Personaje)
    // COMO AQUI

    // En este caso no hay mejores modos.

    @Override
    public void agregarPersona(Personaje p) {
        personajes.add(p);
    }

    @Override
    public void listar() {
        Iterator<Personaje> iterador = personajes.iterator();

        while (iterador.hasNext()) {
            Personaje p = iterador.next();
            System.out.println(p.getNombre());
        }

    }

    @Override
    public void ordenarPersonajes() {
        Comparator<Personaje> comparador = Comparator.comparing(Personaje::getNombre);

        personajes.sort(comparador);
    }

    @Override
    public void batalla(Personaje p1, Personaje p2) {
        System.out.println("Se inicia batalla");
        boolean finBatalla = true;

        do {
            p1.atacar(p2);
            System.out.println(p2.getVida());
            System.out.println("Salud de " + p2.getNombre() + " " + p2.getVida());

            p2.atacar(p1);
            System.out.println("Salud de " + p1.getNombre() + " " + p1.getVida());

            if (p1.getVida() < 0 || p2.getVida() < 0) {
                System.out.println("La batalla ha llegado a su fin");
                finBatalla = false;

            }
        } while (finBatalla);

        if (p1.getVida() < 0) {
            System.out.println(p1.getNombre() + " ha perdido");
            System.out.println(p2.getNombre() + " ha ganado");
        }
        if (p2.getVida() < 0) {
            System.out.println(p2.getNombre() + " ha perdido");
            System.out.println(p1.getNombre() + " ha ganado");

        }
        System.out.println();
    }

}
// comparable solo tiene un metodo llamadao comparableTo, se sobrescribe pero
// antes hay que implementarlo.
// return nombre.comparteTo(personaje.getNombre()); //Comparacion alfabetica. El
// sort ordena por la dirección de memoria.

// compartor por nivel o nnombre es una clase es una clase aparte. ejemplo pdf
// por nombre pagina 12. (ASC o DESC ?)
// Lo llamas (La gente la ha hecho, Directamente con sort.comparign la imagen de
// a abajo de la pg 12)

// La batalla termina hasta que termina la batalla.

// comparable va implementado en la clase
// collection.sort(personajes); si lo implemntamos con lo mencionado nos
// ordenará exitosamente.