import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        /*
         * Ejercicios ficheros. Bloque 1
         * 1. Escriba un programa que muestre por pantalla el contenido de un fichero de
         * texto,
         * así como el total de letras y el total de dígitos numéricos que hay. Plantee
         * dos
         * soluciones distintas.
         * 2. Escriba un programa que, a partir de un fichero de texto, genere dos
         * ficheros: uno
         * que contenga las vocales y otro que contenga las consonantes del fichero
         * original.
         */

         gestionFicheros gestion = new gestionFicheros("Gestion1");
        Scanner sc = new Scanner(System.in);
System.out.println("Nuestra dirección");
        System.out.println(System.getProperty("user.dir"));
String ruta;
String archivo;


  System.out.println("Eliga un opcion segun la solución");
  System.out.println("Solución = 1        solución alternativa= 2");
  System.out.println("Introduce el numero para seleccionar la solución");
  int decision = sc.nextInt();
  sc.nextLine();
  switch (decision) {
  case 1:
  
  System.out.println("Has elegido la solucion 1");
  System.out.println("Inserta la ruta" );
  ruta= sc.nextLine();
  
  System.out.println("Inserta el archivo");
  archivo=sc.nextLine();
  gestion.leerFichero1(ruta, archivo);
  
  break;
  
  case 2:
  
  System.out.println("Has elegido la solucion 2 alternativa");
  System.out.println("Inserta la ruta");
  ruta = sc.nextLine();
  
  System.out.println("Inserta el archivo");
  archivo = sc.nextLine();
  gestion.leerFichero2(ruta, archivo);
  
  break;
  
  default:
  break;
  }
 


System.out.println("Introduce un fichero y direccion para generar dos ficheros independientes que tenga solo sus consonante y otro sus vocales");
  
  
  System.out.println("Inserta el archivo a crear");
  archivo = sc.nextLine();

  System.out.println("Inserta la ruta");
  ruta = sc.nextLine();
  gestion.textoParaVocalesSeparadoConsonante(ruta, archivo);


  

    }


   
}

