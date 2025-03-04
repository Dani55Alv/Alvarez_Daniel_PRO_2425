import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private String facultad;

    private ArrayList<Carrera> listaCarreras;
    private ArrayList<Materia> listaMaterias;

    public Carrera(String nombre, String facultad, ArrayList<Carrera> listaCarreras, ArrayList<Materia> listaMaterias) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.listaCarreras = listaCarreras;
        this.listaMaterias = listaMaterias;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public ArrayList<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void setListaCarreras(ArrayList<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void agregarCarrera( Carrera carreraAnadir) {
        System.out
                .println("Has añadido la carrera " + carreraAnadir.getNombre() + " a la lista " + getNombre());

        listaCarreras.add(carreraAnadir);
    }

    public void eliminarCarrera(  Carrera carreraEliminar) {
        System.out.println(
                "Has quitado la carrera " + carreraEliminar.getNombre() + " a la lista " + getNombre());

        listaCarreras.remove(carreraEliminar);
    }

    public void agregarMateria(Materia materia) {
        System.out.println("Has añadido la materia " + materia.getNombre() + " a la lista " +getNombre());
        listaMaterias.add(materia);

    }

    public void eliminarMateria(Materia materia) {
        System.out.println("Has quitado la materia " + materia.getNombre() + " a la lista " + getNombre());

        listaMaterias.remove(materia);

    }

    public int contarMarterias(Carrera carrera) {
        int nMaterias = carrera.getListaMaterias().size();
        System.out.println("La " + carrera.getNombre() + " tiene esta cantidad de materias: " + nMaterias);
        return nMaterias;

    }

    public Materia encontrarMateria(String materiaEncontrar) {
        System.out.println("Iniciando busqueda");
        boolean materiaEncontrada = false;
        Materia a = null;
        for (Materia materias : listaMaterias) {
            if (materias.getNombre().equals(materiaEncontrar)) {

                a = materias;
                materiaEncontrada = true;

            }

        }

        if (materiaEncontrada) {
            System.out.println("Se ha encontrado la materia: " + materiaEncontrar);

        } else {
            System.out.println("No se ha encontrado la materia: " + materiaEncontrar);

        }
        return a;

    }

    public void crearColeccionMaterias() {
   System.out.println("Has creado una lista de materias");
        this.listaMaterias = new ArrayList<>();

    }
//Seria en vez de añadir carrera sería añadir materia.
    public void crearColeccionCarreras() {
        System.out.println("Has creado una lista de carreras ");
        this.listaCarreras = new ArrayList<>();

    }

    public void mostrarListaCarrera() {

        System.out.println("Mostrando lista de carreras de " + getNombre());
        for (Carrera carrera : listaCarreras) {
            System.out.println(carrera.getNombre());
        }
        System.out.println();

    }

    public void mostrarListaMateria( ) {
        System.out.println("Mostrando lista de materias de " + getNombre());

        for (Materia materia : listaMaterias) {
            System.out.println(materia.getNombre());

        }
        System.out.println();

        
    }
}
