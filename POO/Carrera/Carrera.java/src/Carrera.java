import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private String facultad;

    private ArrayList<Carrera> listaCarreras;
    private ArrayList<Materia> listaMaterias;

    public Carrera(String nombre, String facultad, ArrayList<Carrera> listaCarreras,  ArrayList<Materia> listaMaterias) {
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

    public void agregarCarrera(Carrera carrera) {

        carrera.listaCarreras.add(carrera);
    }

    public void agregarMateria(Materia materia, Carrera carrera){
                carrera.getListaMaterias();
       for (Materia materias : listaMaterias) {
        



       }
        


       
    }

    
}
//Cuando se usa un metodo statico y cuando no.