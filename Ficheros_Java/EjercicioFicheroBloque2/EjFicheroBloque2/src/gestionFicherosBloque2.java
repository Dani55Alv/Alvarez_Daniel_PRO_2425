import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class gestionFicherosBloque2 {

    // C:\Users\daniy\OneDrive\Escritorio\visualStudioClases\gitHub\RepositorioClase\Alvarez_Daniel_PRO_2425\Ficheros_Java\EjercicioFicheroBloque1\ejFicheroBloque1
private String nombreGestion;
    public gestionFicherosBloque2(String nombreGestion){
        this.nombreGestion = nombreGestion;

    }

    public void combinarArchivo(String archivoCombinar, String archivoA, String archivoB, String rutaComun){
 
    Path ruta = Paths.get(rutaComun, archivoCombinar);

        if (Files.exists(ruta)) {
      List<String> b =    leerFichero1(rutaComun, archivoB);

      List<String> a = leerFichero1(rutaComun, archivoA);

      escribirFichero(rutaComun, archivoCombinar, b, a );
        } else {
            // List string
            System.out.println("No existe el fichero a combinar");
        }

   
    }
 
    public void escribirFichero(String ruta, String nombreFichero, List<String> contenidoPorLineaA, 
            List<String> contenidoPorLineaB) {

              Path rutaDef = Paths.get(ruta, nombreFichero);

        try {
            if (Files.exists(rutaDef)) {
                int maxLength = Math.max(contenidoPorLineaA.size(), contenidoPorLineaB.size());
                for (int i = 0; i < maxLength; i++) {
                    // Si la lista A tiene una línea en la posición i, escribirla
                    if (i < contenidoPorLineaA.size() && i %2==0) {
                        Files.write(rutaDef, (contenidoPorLineaA.get(i) + System.lineSeparator()).getBytes(),
                                StandardOpenOption.APPEND);
                    }
                    // Si la lista B tiene una línea en la posición i, escribirla
                    if (i < contenidoPorLineaB.size() && i % 2 == 1) {
                        Files.write(rutaDef, (contenidoPorLineaB.get(i) + System.lineSeparator()).getBytes(),
                                StandardOpenOption.APPEND);
                    }
                }
            } else {
                // List string
                System.out.println("No existe el fichero a escribir");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<String> leerFichero1(String ruta, String archivo) {

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
}