import java.util.Objects;

public class Ejecrcicio8PDF2 {

    private String palabra;
    private int contador;

    public Ejecrcicio8PDF2(String palabra) {
        this.palabra = palabra;
        this.contador=0;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Ejecrcicio8PDF2 other = (Ejecrcicio8PDF2) obj;
    return Objects.equals(palabra, other.palabra); // Suponiendo que 'palabra' es un atributo de la clase
}

@Override
public int hashCode() {
    return Objects.hash(palabra); // Asegúrate de que 'palabra' sea el campo correcto para la comparación
}

}
