import java.io.Serializable;
import java.util.Objects;

public class Deportista implements Serializable{
private String dni;
private String nombre;
private String fechaNacimiento;
private Deportes deporte; 

public Deportista(String dni, String nombre, String fechaNacimiento, Deportes deporte) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.deporte = deporte;
    }


    public String getNombre() {
    return nombre;
}


public String getFechaNacimiento() {
    return fechaNacimiento;
}


    @Override
    public boolean equals(Object obj){
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false ;
    Deportista otraDeportista = (Deportista) obj;
    return dni.equals(otraDeportista.dni);
}

public String getDni() {
        return dni;
    }


@Override 
public int hashCode(){
return Objects.hash(dni);
}

    public void setDni(String dni) {
    this.dni = dni;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}


public void setDeporte(Deportes deporte) {
    this.deporte = deporte;
}


    @Override
    public String toString() {
        return "Nombre: "+ nombre + " - " + " DNI: "+ dni + " - " + " FechaNac: "+ fechaNacimiento + " - " + " Deporte: " + deporte;
    }
}
