/* 
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
*/

import java.util.ArrayList;
import java.util.Random;

public class PuebloDelOeste {
    int establos;
    int cantinas;
    int comisarios;
    int alborotadores;
    String locacion;
    int tiempo;
    ArrayList<Humanos> habitantes = new ArrayList<Humanos>();
    int numeroHumanos;

    ArrayList<Humanos> villanos = new ArrayList<Humanos>();

    int numeroVillanos;

    public PuebloDelOeste() {
        establos = 3;
        locacion = "Oeste de los Estados Unidos";
        tiempo = 1850;
        numeroHumanos = 0; // !
        numeroVillanos = 0;

    }

    public int getNumeroHumanos() {
        return numeroHumanos;
    }

    public void empadronar(Humanos humanos) {
        if (numeroHumanos < 100) {
            this.habitantes.add(humanos);
            numeroHumanos++;
        } else {
            System.out.println("Esta lleno de humanos");
        }

    }

    public void convertirVillanos(Humanos humanos) {
        if (numeroVillanos < 10) {
            this.villanos.add(humanos);
            numeroVillanos++;
        } else {
            System.out.println("Esta lleno de villanos");
        }

    }

    

    public ArrayList<Humanos> getVillanos() {
        return villanos; // show array
    }


    public void  eliminarHabitante( String nombre) {
    
        for (Humanos humanos : habitantes) {
            if (humanos.getNombre()==nombre ) {
                
             humanos.setMuertoOvivo(false);
            }
        }

    
    }


    public void entrarEnCantina(Villanos villano){

Random random = new Random(10);

if (random.nextInt(10) > 5) {
    villano.tomarWhiskey();
    System.out.println("El villano bebió una copa");
}
    }

}