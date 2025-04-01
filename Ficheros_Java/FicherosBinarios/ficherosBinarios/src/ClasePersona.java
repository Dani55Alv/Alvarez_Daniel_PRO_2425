import java.io.Serializable;
import java.util.Objects;

public class ClasePersona implements Serializable {

    private String nombre;
    private int edad;
    private double altura;
    public ClasePersona (String nombre, int edad, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;
    }








    @Override
    public boolean equals(Object obj){
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false ;
    ClasePersona otraPersona = (ClasePersona) obj;
    return nombre.equals(otraPersona.nombre);
}

@Override 
public int hashCode(){
return Objects.hash(nombre);
}


@Override
public String toString(){
    return "Nombre: " + nombre + " Altura: "+ altura + " Edad: " + edad;
}


    }


