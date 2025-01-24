import java.util.ArrayList;

public class App {
    public static void main(String[] args){
      //Lista de carreras
          ArrayList<Carrera> listaCarreras = new   ArrayList<Carrera>()  ;

          // Lista de materias
          ArrayList<Materia> listaMaterias = new ArrayList<Materia>();


          //Profesores
         Profesor andres = new Profesor("Andres", 0, 0, 0);

         //MAterias
        Materia historia = new Materia("Historia romana", andres);


          //Carreras
        Carrera grado_historia = new Carrera("Historia clásica", "Facultad Merida", listaCarreras, listaMaterias);





    }
}
