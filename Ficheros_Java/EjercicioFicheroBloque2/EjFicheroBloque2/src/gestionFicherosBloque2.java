import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class gestionFicherosBloque2 {

    // C:\Users\daniy\OneDrive\Escritorio\visualStudioClases\gitHub\RepositorioClase\Alvarez_Daniel_PRO_2425\Ficheros_Java\EjercicioFicheroBloque1\ejFicheroBloque1
    private String nombreGestion;

    public gestionFicherosBloque2(String nombreGestion) {
        this.nombreGestion = nombreGestion;

    }

    public void combinarArchivo(String archivoCombinar, String archivoA, String archivoB, String rutaComun) {

        Path ruta = Paths.get(rutaComun, archivoCombinar);

        if (Files.exists(ruta)) {
            List<String> b = leerFichero1(rutaComun, archivoB);

            List<String> a = leerFichero1(rutaComun, archivoA);

            escribirFichero(rutaComun, archivoCombinar, b, a);
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
                int textoMasDensoPorLinea = Math.max(contenidoPorLineaA.size(), contenidoPorLineaB.size());
                // Iteramos sobre el contenido de ambas listas, asegurándonos de no quedarnos
                // sin procesar ninguna línea
                // Incluso si una lista es más corta, el valor de `textoMasDensoPorLinea` garantiza que
                // ambas listas sean recorridas por completo
                for (int i = 0; i < textoMasDensoPorLinea; i++) {
                   
                    if (i < contenidoPorLineaA.size() ) {
                        Files.write(rutaDef, (contenidoPorLineaA.get(i) + System.lineSeparator()).getBytes(),
                                StandardOpenOption.APPEND);
                    }
                    if (i < contenidoPorLineaB.size() ) {
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

    public void deleteFichero(String ruta, String nombreFichero) throws IOException {
        // Borrar
        // Necesitamos un path es decir una ruta pero ya lo tenemos
        // Path rutaDirectorio = Paths.get("DataSet/archivo.txt"); ejemplo;

        Path rutaDef = Paths.get(ruta, nombreFichero);// ruta y nombre archivo (Donde crea el archivo .txt)

        // Antes de borrar hay que preguntar si existe
        if (Files.exists(rutaDef)) {
            try { // !Ojo¡ ademas de con try-catch tambien se pueden lanzar excepciones con if
                Files.delete(rutaDef);
                System.out.println("Archivo eliminado correctamente.");
            } catch (IOException e) {
                throw new IOException("No se pudo eliminar el archivo: " + rutaDef, e);
            }
        } else {
            System.out.println("El archivo " + nombreFichero + " no existe en la ruta especificada.");
        }
    }



     public void verPropiedadesFichero(String ruta, String fichero) throws IOException{
        Path rutaCompleta = Paths.get(ruta, fichero);
 
        if (Files.exists(rutaCompleta)) {

            System.out.println("El fichero existe");

        try {
            // obtener atributos
            BasicFileAttributes atributos = Files.readAttributes(rutaCompleta, BasicFileAttributes.class);
            // !0j0¡ trabajamos con el nombre en este caso "atributos".
            // Mostrando/Accediendo a los atributos

            System.out.println("Es un directorio?: " + atributos.isDirectory());
            System.out.println("Es un fichero? " + atributos.isRegularFile());

            if (atributos.isDirectory() == true) {


        try {
            // Creamos el Stream del contenido del directorio
            DirectoryStream<Path> flujoDatos = Files.newDirectoryStream(rutaCompleta);
            System.out.println("Contenido del directorio llamado "+ fichero);
            // Iteramos sobre el contenido
            for (Path archivo : flujoDatos) {
                System.out.println(archivo); // imprime el nombre del archivo
            }

        } catch (IOException e) {
            System.out.println("Error en el listado de Archivos");
        }
    

            }else{
                System.out.println("Tamaño del fichero: " + atributos.size());
                System.out.println("Nombre del fichero: " + rutaCompleta.getFileName());

                System.out.println("Permisos del fichero " + fichero);
//Los permisos es con la clase Files;
System.out.println( "Es leible? --> "  +               Files.isReadable(rutaCompleta));
              System.out.println("Se puede escribir? --> " + Files.isWritable(rutaCompleta));  
                System.out.println("Se puede ejecutar? --> " + Files.isExecutable(rutaCompleta));


DosFileAttributes atributosPermisos = Files.readAttributes(rutaCompleta, DosFileAttributes.class);
            System.out.println("Es oculto: " + atributosPermisos.isHidden());
            System.out.println("Es de solo lectura: " + atributosPermisos.isReadOnly());


            }
          
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }else{

        System.out.println("NO existe el fichero en tal ruta " );
        throw new IOException();
    }
    }

}
