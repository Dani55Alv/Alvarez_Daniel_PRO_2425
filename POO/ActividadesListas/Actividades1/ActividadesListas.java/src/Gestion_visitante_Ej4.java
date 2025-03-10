import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Gestion_visitante_Ej4 {

            private Set<Visitante_Ej4> conjuntoOrdenado ;

    public Gestion_visitante_Ej4(){
this.conjuntoOrdenado = new LinkedHashSet<>();

    }

public void ordenarVisitantes() {
    Comparator<Visitante_Ej4> comparador = Comparator.comparing(Visitante_Ej4::getNombre);



}

}