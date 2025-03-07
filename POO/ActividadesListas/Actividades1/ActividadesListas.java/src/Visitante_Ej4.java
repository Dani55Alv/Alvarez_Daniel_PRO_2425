import java.util.Objects;

public class Visitante_Ej4 {
private String nombre;

    public  Visitante_Ej4(String nombre) {

        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }


     @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Visitante_Ej4 otroNombre = (Visitante_Ej4) obj;
        return nombre.equals(otroNombre.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre); //Devuelve el hascode del atributo string palabra
    }

    @Override
    public String toString() {
        return nombre; //Se duelve al imprimir el objeto, el atributo palabra.
    }
}
