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
                          String lineaPorCaractarCensurado = "";

                          String palabraPorCaractar="";
                         String espantapájaros = "espantapájaros";
                         boolean imprimir = false;

        for (String linea : chat) {


            for (int i = 0; i < linea.length(); i++) {
                char caracter = linea.charAt(i);
                palabraPorCaractar += caracter; //Detecta palabrotas
                   lineaPorCaractar += caracter; //Imprime las lineas char a char
              
                  imprimir=false;
               
                if (palabraPorCaractar.equals("espantapájaros")) {
                    // i= i-espantapájaros.length();
              imprimir =true;
                    
                    for (int j = 0; j < lineaPorCaractar.length() - espantapájaros.length(); j++) {
                               lineaPorCaractarCensurado += lineaPorCaractar.charAt(j);         
                            
                            } 
                    




                    System.out.println("Palabra mal sonante detectada");
              //     i= i-espantapájaros.length()+ (espantapájaros.length());
                 // lineaPorCaractar += "YY";

                   for (int j = 0; j < espantapájaros.length(); j++) {
                         if (j==0 || j == espantapájaros.length()-1) {
                             lineaPorCaractarCensurado += espantapájaros.charAt(j);

                         }else{
                             lineaPorCaractarCensurado += "*";

                         }
                   }
                   
                 // i = i + espantapájaros.length();
               //  lineaPorCaractar += "YY";

                }
            
                if (caracter == ' ' || caracter == '.' || caracter == ',') {
                    palabraPorCaractar = "";
                     
                }
            }
                  if (imprimir==true) {
                    System.out.println(lineaPorCaractarCensurado);
                  }else{
                      System.out.print(lineaPorCaractar);

                  }

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