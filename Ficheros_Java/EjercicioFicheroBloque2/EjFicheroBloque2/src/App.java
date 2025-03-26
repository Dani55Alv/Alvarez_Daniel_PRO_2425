import java.util.Scanner;

public class App {
public static void ejercicio2(){

    
    System.out.println("Vamos a combinar un archivo");
 
    gestionFicherosBloque2 gestionFicherosBloque2 = new gestionFicherosBloque2("Gestion2");

    Scanner sc = new Scanner(System.in);
    
    String ruta = "";
    String nombreFichero= "";
    String a = "";
    String b = "";

    System.out.println("Introduce la ruta comun");
         ruta=sc.nextLine();
    System.out.println("Introduce el nombre del fichero combinado");
       nombreFichero= sc.nextLine();

       System.out.println("Introduce el nombre del fichero a combinar (A)");
       a = sc.nextLine();

       System.out.println("Introduce el nombre del fichero a combinar (B)");
       b = sc.nextLine();

       gestionFicherosBloque2.combinarArchivo(nombreFichero, a, b, ruta);


       
}
    public static void main(String[] args) throws Exception {


/*
 * Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros,
 * de tal forma que en el fichero resultante aparezcan las líneas de los dos
 * primeros
 * ficheros mezcladas, es decir, la primera línea será del primer fichero, la
 * segunda
 * será del segundo fichero…
 * Hay que tener en cuenta que los ficheros de los que se cogen las líneas
 * pueden
 * tener tamaños diferentes.
 */
ejercicio2();

    }
}
