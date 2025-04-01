import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App21 {
    public static void main(String[] args) throws Exception {
        // La 24

        Set<String> cienValores = new HashSet<>();

        gestionFicherosBloque3 gestionadorBloque3 = new gestionFicherosBloque3();
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * (1000 + 1));

            if (!cienValores.add(Integer.toString(random))) {
                System.out.println(random + " ya estaba en el HashSet.");
                i--;
            }

        }

        gestionadorBloque3.escribirFichero(cienValores);

        // Parte 2

        Set<Integer> cienValoresOrdenadoINT = new TreeSet<>();

        for (String string : cienValores) {
            int numero = Integer.parseInt(string);
            cienValoresOrdenadoINT.add(numero);

        }
System.out.println("Ordenado");

System.out.println("Ordenado");

Set<String> cienValoresOrdenadoSTRING = new LinkedHashSet<>();
        for (Integer numeros : cienValoresOrdenadoINT) {

              String  string = Integer.toString(numeros);

                cienValoresOrdenadoSTRING.add(string);
            }

        

        for (String string : cienValoresOrdenadoSTRING) {
            System.out.println(string);
        }
        gestionadorBloque3.escribirFichero2(cienValoresOrdenadoSTRING);

    }
}

// hacer ejemplo binario