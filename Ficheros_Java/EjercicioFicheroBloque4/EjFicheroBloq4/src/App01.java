
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
int numeroIntentos=0;
int numeroRondas = 1;
  Gestionador_Bloque_4 gestion4 = new Gestionador_Bloque_4();
boolean salida=false;
int jugadorEntrada =0;
do{
    int random = (int) (Math.random() * (1000 + 1));

do{
        
        System.out.println("Introduce numero para averiguar el número secreto que está entre el 0 y el 1000");
        jugadorEntrada = sc.nextInt();
        numeroIntentos++;

if (jugadorEntrada==random) {
    System.out.println("LOGRASTE ACERTAR EL NÚMERO SECRETO");
    salida=true;
}else if(jugadorEntrada<random){
    System.out.println("Ups te has quedado corto, esta por arriba");
    int pista = random-jugadorEntrada;
    System.out.println("Mira "+ pista);
}else if(jugadorEntrada>random){
    System.out.println("Ups ta has pasado, esta por debajo");
    int pista = random - jugadorEntrada;
    System.out.println("Mira " + pista);

}


}while(!salida);
salida=false;
System.out.println("Quiere volver a jugar?");
System.out.println("no/si");

sc.nextLine();
String decision = sc.nextLine().toLowerCase();

if(decision.equals("no")){
salida=true;
String stringIntento = "El usuario Daniel ha necesitado para ganar, este numero de intentos: " + numeroIntentos
        + " en la ronda " + numeroRondas + " " + "\n";
System.out.println("El usuario Daniel ha necesitado para ganar, este numero de intentos: " + numeroIntentos
        + " en la ronda " + numeroRondas + " " + "\n");
gestion4.escribirFichero(stringIntento);

}else{
    System.out.println("Jugando otra vez");
    
  String stringIntento= "El usuario Daniel ha necesitado para ganar, este numero de intentos: " + numeroIntentos   +" en la ronda "+  numeroRondas + " "+ "\n";
  
  gestion4.escribirFichero(stringIntento);

numeroRondas++;
    numeroIntentos =0;


}


} while (!salida);








    }

}
