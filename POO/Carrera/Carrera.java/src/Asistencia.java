import java.util.ArrayList;

public class Asistencia {

    private String fecha;
    private ArrayList<Alumno> listaAlumnosAsisten;

    public Asistencia(String fecha, ArrayList<Alumno> listaAlumnosAsisten) {
        this.fecha = fecha;
        this.listaAlumnosAsisten = listaAlumnosAsisten;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void agregarAlumno(Alumno alumno) {

        System.out.println("Agregando al alumno " + alumno.getNombre() + " a la lista de asistencia " + getFecha());

        listaAlumnosAsisten.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {

        System.out.println("Eliminado al alumno " + alumno.getNombre() + " a la lista de asistencia " + getFecha());
        listaAlumnosAsisten.remove(alumno);

    }

    public int contarAlumnos() {
        int nAlumnos = getListaAlumnosAsisten().size();
        System.out.println("La lista de asistencia del "+ getFecha()+" tiene esta cantidad de alumnos que asisten: " + nAlumnos);
        return nAlumnos;

    }

    public void mostrarListaAlumnosAsisten() {

        System.out.println("Mostrando lista de alumnos que ha asistido a la fecha "+ getFecha());
        for (Alumno alumno : listaAlumnosAsisten) {
            System.out.println(alumno.getNombre());
        }
        System.out.println();

    }

    public ArrayList<Alumno> getListaAlumnosAsisten() {
        return listaAlumnosAsisten;
    }

   

}
