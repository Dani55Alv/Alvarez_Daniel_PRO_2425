import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//"Ninguna lista"
        // Lista de carreras
        ArrayList<Carrera> listaCarreras = new ArrayList<Carrera>();

        // Lista de materias
        // ArrayList<Materia> listaMaterias = new ArrayList<Materia>();

        // Lista de alumnos
        // ArrayList<Alumno> listaAlumnosAsisten = new ArrayList<Alumno>();
        // ArrayList<Alumno> listaAlumnosInscritosMateria = new ArrayList<Alumno>();

        // Lista de asistencias
        ArrayList<Asistencia> listaAsistencias = new ArrayList<Asistencia>();

        // Asitencia
        Asistencia fecha1 = new Asistencia("27/01/2025", new ArrayList<Alumno>());
        Asistencia fecha2 = new Asistencia("28/01/2025", new ArrayList<Alumno>());
        Asistencia fecha3 = new Asistencia("30/01/2025", new ArrayList<Alumno>());

        // Profesores
        Profesor andres = new Profesor("Andres", 0, 1000, 2);

        Profesor alberto = new Profesor("Alberto", 0, 2000, 7);

        Profesor pedro = new Profesor("Pedro", 0, 3000, 15);

        // Alumnos
        Alumno pepito = new Alumno("Pepito", 0);
        Alumno fulanito = new Alumno("Fulanito", 0);
        Alumno miguelito = new Alumno("Miguelito", 0);

        // Materias

        Materia hR = new Materia("Historia romana", andres,
                new ArrayList<Alumno>(),
                new ArrayList<Alumno>(), new ArrayList<Asistencia>());
        Materia hG = new Materia("Historia griega", andres,
                new ArrayList<Alumno>(),
                new ArrayList<Alumno>(), new ArrayList<Asistencia>());

        Materia analisis = new Materia("Analisis", alberto,
                new ArrayList<Alumno>(),
                new ArrayList<Alumno>(), new ArrayList<Asistencia>());
        Materia trigonometria = new Materia("Trigonometria", pedro,
                new ArrayList<Alumno>(),
                new ArrayList<Alumno>(), new ArrayList<Asistencia>());

        // Carreras
        Carrera grado_historia = new Carrera("Historia clásica", "Facultad Merida", new ArrayList<Carrera>(),
                new ArrayList<Materia>());
        Carrera grado_matematicas = new Carrera("Matematicas", "Facultad de Leon",
                new ArrayList<Carrera>(), new ArrayList<Materia>());

        // Procedmientos Carrera

        System.out.println("Procedmientos de la clase Carrera");

        grado_historia.agregarMateria(hR);

        grado_historia.agregarMateria(hG);

        grado_historia.encontrarMateria("Historia griega");

        grado_historia.encontrarMateria("Historia romana");

        grado_historia.contarMarterias(grado_historia);

        grado_historia.eliminarMateria(hG);

        grado_historia.encontrarMateria("Historia griega");

        grado_historia.contarMarterias(grado_historia);

        // Lista carreras
        // Aqui se añaden las carreras historia clasica, matematicas en la lista de la
        // carrera de historia clasica.
        System.out.println();
        grado_historia.crearColeccionCarreras();
        grado_historia.agregarCarrera(grado_historia);
        grado_historia.agregarCarrera(grado_matematicas);
        grado_historia.mostrarListaCarrera();
        grado_matematicas.mostrarListaCarrera();

        // Aqui se quita el grado historia para que quede en la lista de historia solo
        // la carrera de matematicas,
        grado_historia.eliminarCarrera(grado_historia);
        grado_historia.mostrarListaCarrera();
        grado_historia.mostrarListaCarrera();

        // Lista Materias
        System.out.println();
        // grado_matematicas.mostrarListaMateria(grado_matematicas);

        grado_matematicas.crearColeccionMaterias();
        grado_matematicas.agregarMateria(trigonometria);
        grado_matematicas.agregarMateria(analisis);
        grado_matematicas.mostrarListaMateria();

        grado_matematicas.eliminarMateria(analisis);
        grado_matematicas.mostrarListaMateria();
        grado_matematicas.encontrarMateria(analisis.getNombre());

        // Clase Profesor
        System.out.println();

        System.out.println("Sueldo base");
        System.out.println(pedro.getBasico());
        System.out.println(andres.getBasico());
        System.out.println(alberto.getBasico());

        System.out.println("Sueldo con antiguedad");
        System.out.println(pedro.calcularSueldo(pedro));
        System.out.println(andres.calcularSueldo(andres));
        System.out.println(alberto.calcularSueldo(alberto));

        // Clase asitencia
        fecha1.agregarAlumno(pepito);
        fecha1.agregarAlumno(fulanito);
        fecha2.agregarAlumno(miguelito);
        System.out.println();
        fecha1.contarAlumnos();
        fecha2.contarAlumnos();
        fecha1.eliminarAlumno(fulanito);

        fecha1.contarAlumnos();
        fecha1.contarAlumnos();

        fecha1.mostrarListaAlumnosAsisten();
        fecha2.mostrarListaAlumnosAsisten();

        // "27/01/2025" Asistencia
        // "28/01/2025" Asistencia1

        // Clase materia
        fecha1.agregarAlumno(fulanito);

        hG.mostrarListaAlumnosMateria();
        hG.calcularInscritos();

        hG.agregarAlumno(pepito);
        hG.agregarAlumno(fulanito);

        hG.mostrarListaAlumnosMateria();
        hG.calcularInscritos();
        System.out.println("ad");
        hG.agregarAsistencia(fecha1);

        System.out.println();
        fecha1.mostrarListaAlumnosAsisten();
        hG.mostrarListaAlumnosMateria();

        hG.calcularAsistencia(fecha1);

        fecha1.eliminarAlumno(fulanito);

        fecha1.mostrarListaAlumnosAsisten();
        hG.mostrarListaAlumnosMateria();

        hG.calcularAsistencia(fecha1);

        // Lo dificil.
        fecha2.mostrarListaAlumnosAsisten();

        hG.agregarAsistencia(fecha2);
        fecha2.mostrarListaAlumnosAsisten();
        hG.mostrarListaAlumnosMateria();
        fecha2.mostrarListaAlumnosAsisten();
        hG.calcularAsistencia(fecha2);

        // Testeando
        System.out.println("Testeando");

        trigonometria.mostrarListaAlumnosMateria();
        trigonometria.agregarAlumno(miguelito);
        trigonometria.agregarAlumno(pepito);

        fecha3.agregarAlumno(miguelito);
        fecha3.agregarAlumno(pepito);
        trigonometria.agregarAsistencia(fecha3);

        trigonometria.mostrarListaAsistencias();

        trigonometria.calcularAsistencia(fecha3);

        trigonometria.elimnarAlumno(miguelito);
        trigonometria.calcularAsistencia(fecha3); // Sale 200, asi que lo controlamos

        trigonometria.agregarAlumno(miguelito); // lo volvemos a inscribir para comprobar.
        trigonometria.calcularAsistencia(fecha3);

        fecha3.eliminarAlumno(miguelito);
        trigonometria.calcularAsistencia(fecha3);
/*
 * System.out.println(" ____________________________________________________");
 * System.out.println("|                 Menu procedimientos                |");
 * System.out.println("|----------------------------------------------------|");
 * System.out.println("|                                                    |");
 * 
 * System.out.println("| 1.-Clase Materia                                   |");
 * System.out.println("|                                                    |");
 * 
 * System.out.println("| 2.-Clase Carrera                                   |");
 * System.out.println("|                                                    |");
 * 
 * System.out.println("| 3.-Clase Profesor                                  |");
 * System.out.println("|                                                    |");
 * 
 * System.out.println("| 4.-Clase Asistencia                                |");
 * System.out.println("|                                                    |");
 * System.out.println(" ----------------------------------------------------");
 * 
 * Scanner sc = new Scanner(System.in);
 * int op1 = sc.nextInt();
 * 
 * switch (op1) {
 * case 1:
 * System.out.println("Has elegido la clase materia");
 * System.out.println("Selecciona uno de los sigiente metodos");
 * 
 * break;
 * 
 * case 2:
 * System.out.println("Has elegido la clase carrera");
 * System.out.println("Selecciona uno de los sigiente metodos");
 * 
 * break;
 * case 3:
 * System.out.println("Has elegido la clase profesor");
 * System.out.println("Selecciona uno de los sigiente metodos");
 * 
 * break;
 * case 4:
 * System.out.println("Has elegido la clase asitencia");
 * 
 * System.out.println("Selecciona uno de los sigiente metodos");
 * break;
 * default:
 * break;
 * }
 */
hG.mostrarListaAsistencias();
hG.elimnarAsistencia(fecha3);
hG.elimnarAsistencia(fecha2);
hG.elimnarAsistencia(fecha1);

hG.mostrarListaAsistencias();

    }
}