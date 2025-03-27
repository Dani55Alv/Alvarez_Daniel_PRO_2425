import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionToxicidad gestionToxicidad = new GestionToxicidad();
        String ruta = "";
        String archivo = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce ruta");
        ruta = sc.nextLine();
        System.out.println("Introduce archivo");
        archivo = sc.nextLine();

        List<String> chat = gestionToxicidad.leerFicheros(ruta, archivo);
        System.out.println("Versión censurada");

        String lineaPorCaractar = "";
        String palabraPorCaractar = "";
        String espantapájaros = "espantapájaros";

        
        // Lista de palabras a censurar
        List<String> palabrasCensuradas = new ArrayList<>();
        palabrasCensuradas.add("espantapájaros");
        palabrasCensuradas.add("pelotudo");
        palabrasCensuradas.add("manco");

        for (String linea : chat) {
            lineaPorCaractar = ""; // Limpiamos la línea por carácter al empezar con una nueva línea
            for (int i = 0; i < linea.length(); i++) {
                char caracter = linea.charAt(i);
                palabraPorCaractar += caracter; // Detecta palabrotas
                lineaPorCaractar += caracter; // Imprime las líneas char a char

                // Si encontramos la palabra "espantapájaros", la censuramos
               for (String palabra : palabrasCensuradas) {
                    if (palabraPorCaractar.equals(palabra)) {
                        System.out.println("Palabra mal sonante detectada: " + palabra);

                    // Reemplazamos con asteriscos
                    lineaPorCaractar = lineaPorCaractar.substring(0,
                            lineaPorCaractar.length() - espantapájaros.length()); // Eliminar la palabra no censurada
                    for (int j = 0; j < espantapájaros.length(); j++) {
                        if (j == 0 || j == espantapájaros.length() - 1) {
                            lineaPorCaractar += espantapájaros.charAt(j); // Mantenemos la primera y última letra
                        } else {
                            lineaPorCaractar += "*"; // Reemplazamos el resto con asteriscos
                        }
                    }

                    // Reiniciamos la variable para seguir buscando otras palabras
                    palabraPorCaractar = "";
                }
            }

                // Si encontramos un espacio, punto o coma, consideramos que hemos llegado al
                // final de una palabra
                if (caracter == ' ' || caracter == '.' || caracter == ',') {
                    palabraPorCaractar = ""; // Reiniciamos para empezar con la siguiente palabra
                }
            }
            System.out.println(lineaPorCaractar); // Imprimimos la línea censurada
        }
    }
}