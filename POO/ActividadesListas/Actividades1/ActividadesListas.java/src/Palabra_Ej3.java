import java.util.Objects;

public class Palabra_Ej3 {
private String palabra;

    public Palabra_Ej3(String palabra){
this.palabra= palabra;


    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Palabra_Ej3 otraPalabra = (Palabra_Ej3) obj;
        return palabra.equals(otraPalabra.palabra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palabra); //Devuelve el hascode del atributo string palabra
    }

    @Override
    public String toString() {
        return palabra; //Se duelve al imprimir el objeto, el atributo palabra.
    }
}
