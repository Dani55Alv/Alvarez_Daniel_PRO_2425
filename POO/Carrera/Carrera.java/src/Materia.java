public class Materia {
//Materia tiene que tener una lista de alumnos aunque no lo pida explicitamente el ejercicio;
    private String nombre;
    private Profesor titular;
   
    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getTitular() {
        return titular;
    }


}
