import java.util.ArrayList;

public class Materia {

    private String nombre;
    private Profesor titular;
    private ArrayList<Alumno> listaAlumnosInscritosMateria;
    private ArrayList<Asistencia> listaAsistencias; //=  new  arrlist lista sentencia
    //"Aqui ya la he declarado asi que no lo pongo en el constructor"

    public Materia(String nombre, Profesor titular, ArrayList<Alumno> listaAlumnosInscritosMateria,
            ArrayList<Alumno> listaAlumnosAsisten, ArrayList<Asistencia> listaAsistencias) {
        this.nombre = nombre;
        this.titular = titular;
        this.listaAlumnosInscritosMateria = listaAlumnosInscritosMateria;
        this.listaAsistencias = listaAsistencias;
        this.listaAsistencias = listaAsistencias;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void agregarAlumno(Alumno alumno) {
        boolean estaInscrito = true; // Antes estaba false
        for (Alumno alumnos : listaAlumnosInscritosMateria) {
            if (alumno.getNombre().equals(alumnos.getNombre())) {
                estaInscrito = true;
            }
        }
        if (estaInscrito) {
            System.out.println("Agregando al alumno " + alumno.getNombre() + " a la materia " + getNombre());
            listaAlumnosInscritosMateria.add(alumno);
        } else {

            System.out.println("El alumno " + alumno.getNombre() + " no esta incristo a la materia " + getNombre()
                    + " por lo tanto no puede asistir");

        }

    }

    public void elimnarAlumno(Alumno alumno) {

        boolean estaInscrito = false;
        for (Alumno alumnos : listaAlumnosInscritosMateria) {
            if (alumno.getNombre().equals(alumnos.getNombre())) {
                estaInscrito = true;
            }
        }
        if (estaInscrito) {
            System.out.println("Eliminando al alumno " + alumno.getNombre() + " a la materia " + getNombre());
            listaAlumnosInscritosMateria.remove(alumno);
        } else {

            System.out
                    .println("El alumno " + alumno.getNombre() + " ya estaba no incristo en la materia " + getNombre());

        }

    }

    public void agregarAsistencia(Asistencia asistencia) {
        boolean alumnoNoInscrito = false;
        for (Alumno alumnoAsisten : asistencia.getListaAlumnosAsisten()) {
            if (!listaAlumnosInscritosMateria.contains(alumnoAsisten)) {
                System.out.println("Error: El alumno " + alumnoAsisten.getNombre() + " no está inscrito.");
            }

        }

        if (!alumnoNoInscrito) {
            System.out.println("Agregando la asistencia " + asistencia.getFecha() + " a la materia " + getNombre());
            listaAsistencias.add(asistencia);
        } else {

            System.out.println(
                    "Error, no se puede agregar la asistencia debido a que hay un alumno que no pertenece a la materia");
        }

    }

    public void elimnarAsistencia(Asistencia asistencia) {

        //if lAsistencia contains asistencia //int inde=l Asisnte.indefof(asistencia); //lAsistencia.remove(index))
        System.out.println("Eliminando la asistencia" + asistencia.getFecha() + " a la materia " + getNombre());
        listaAsistencias.remove(asistencia);
    }

    public int calcularInscritos() {
        int nAlumnos = listaAlumnosInscritosMateria.size();
        System.out.println("La lista de alumnos inscritos tiene esta cantidad de alumnos: " + nAlumnos);
        return nAlumnos;

    }

    public double calcularAsistencia(Asistencia fAsistencia) {
        boolean estaEnLaListaDeAsistencias = false;
        for (Asistencia asistencias : listaAsistencias) {
            if (!fAsistencia.getFecha().equals(asistencias.getFecha())) {
                estaEnLaListaDeAsistencias = true;
            }

        }
        boolean estaEnLaListaInscritos = false;

        for (Alumno alumnoAsisten : fAsistencia.getListaAlumnosAsisten()) {
            if (!listaAlumnosInscritosMateria.contains(alumnoAsisten)) {
                System.out.println("Error: El alumno " + alumnoAsisten.getNombre() + " no está inscrito.");
                estaEnLaListaInscritos = true;
            }
        }
        if (estaEnLaListaDeAsistencias) {
            System.out
                    .println("No se puede realizar el calculo debido a que la asistencia " + fAsistencia.getFecha()
                            + " no esta en la lista de asistencias de " + getNombre());
            double porcentaje = 0;
            return porcentaje;

        } else if (estaEnLaListaInscritos) {
            System.out.println(
                    "No se puede realizar el calculo debido a que hay un alumno que ya no está inscrito a la materia "
                            + getNombre());

            double porcentaje = 0;
            return porcentaje;
        }

        else {

            System.out
                    .println("Procediendo a calcular el porcentaje de asistencia de la fecha "
                            + fAsistencia.getFecha()
                            + " de la materia " + getNombre() + ":");

            double nAlumnosInscritos = getListaAlumnosInscritosMateria().size();
            if (nAlumnosInscritos == 0) {
                System.out.println("No hay alumnos inscritos en la materia.");
                return 0;
            } else {
                double nAlumnosAsisten = fAsistencia.getListaAlumnosAsisten().size();

                double porcentaje = (nAlumnosAsisten / nAlumnosInscritos) * 100;

                System.out.println(porcentaje + "");

                return porcentaje;
            }
        }
    }

    public void mostrarListaAlumnosMateria() {
        System.out.println("En la materia " + getNombre() + " estan inscritos los siguientes alumnos:");
        for (Alumno alumno : listaAlumnosInscritosMateria) {
            System.out.println(alumno.getNombre());
        }
        System.out.println();
    }

    public ArrayList<Alumno> getListaAlumnosInscritosMateria() {
        return listaAlumnosInscritosMateria;
    }

    public ArrayList<Asistencia> getListaAsistencias() {
        return listaAsistencias;
    }

    public void crearColeccionAlumnosInscritosMateria() {

        this.listaAlumnosInscritosMateria = new ArrayList<>();

    }

    public void crearColeccionAsistencias() {

        this.listaAsistencias = new ArrayList<>();

    }

    public void mostrarListaAsistencias() {
        System.out.println("En la materia " + getNombre() + " contiene las siguientes asistencias:");
        for (Asistencia asistencias : listaAsistencias) {
            System.out.println(asistencias.getFecha());
        }
        System.out.println();
    }

}
//System.out.printf("El dia %s , fecha"); s significa string (java printf tipos)