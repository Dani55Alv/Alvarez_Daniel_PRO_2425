import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App3 {
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
        System.out.println("Version censurada");
                          String lineaPorCaractar="";
                          String palabraPorCaractar="";
                         String espantapájaros = "espantapájaros";
                         boolean imprimir = false;

        for (String linea : chat) {


            for (int i = 0; i < linea.length(); i++) {
                char caracter = linea.charAt(i);
                palabraPorCaractar += caracter; //Detecta palabrotas
                   lineaPorCaractar += caracter; //Imprime las lineas char a char
              
                  
               
                if (palabraPorCaractar.equals("espantapájaros")) {
                   
                    System.out.println("Palabra mal sonante detectada");
                   i= i-espantapájaros.length()+ (espantapájaros.length());
                 // lineaPorCaractar += "YY";

                   for (int j = 0; j < espantapájaros.length(); j++) {
                         if (j==0 || j == espantapájaros.length()-1) {
                             lineaPorCaractar += espantapájaros.charAt(j);

                         }else{
                            lineaPorCaractar += "*";

                         }
                   }
                   
                 // i = i + espantapájaros.length();
               //  lineaPorCaractar += "YY";

                }
            
                if (caracter == ' ' || caracter == '.' || caracter == ',') {
                    palabraPorCaractar = "";
                     
                }
            }
            System.out.print(lineaPorCaractar);

            lineaPorCaractar = "";
            System.out.println();

        }

        // for (String linea : chat) {
        // System.out.println(linea);
        // }

        // Empieza en el caracter 8 (si empieza cero)

        // entry set --> get key --> get value

    }
}