import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GestionToxicidad {

private List<String> lista ;
    public GestionToxicidad(){
    this.lista= new ArrayList<>();
     }


     public List<String> leerFicheros(String ruta, String archivo) {

         Path rutaDef = Paths.get(ruta, archivo);

         List<String> archivoTexto;
         List<String> textoTotal = new ArrayList<>();

         try {
             if (Files.notExists(rutaDef)) {
                 System.out.println("El archivo no existe");
             } else {

                 archivoTexto = Files.readAllLines(rutaDef);
                 System.out.println("Reproduciendo por linea el texto");
                 for (String linea : archivoTexto) {
                     System.out.println(linea);
                     textoTotal.add(linea);
                 }
                 System.out.println("Fin");
             }

         } catch (Exception e) {
             System.err.println("Error");
             e.printStackTrace();
         }
         return textoTotal;
     }
public void escribirFichero(String rutaCompleta ,List<String> contenidoPorLinea) {

        Path rutaYFichero = Paths.get(
                rutaCompleta
        );

        try {
            if (Files.exists(rutaYFichero)) {
                Files.write(rutaYFichero, contenidoPorLinea, StandardOpenOption.APPEND);

            } else {
                // List string
                System.out.println("No existe el fichero a escribir");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
//Hacer funciones es decir con return.
