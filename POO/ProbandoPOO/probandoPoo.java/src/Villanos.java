
/**
 * 
 * 
 * @autor Daniel Alvarez Morales
 * @version 1.0
 * @Class Villanos clase para villanos que hereda de clase Humanos
 * 
 * 
 */

public class Villanos extends Humanos {
    String colorBigote;
    String colorSombrero;
    String aspecto;
    int ebriedad;
    int numeroDeDamiselas;
    Humanos[] damisela = new Humanos[10];
    // En vez una instancia va a ser un array es decir un array de objetos humanos

    public Villanos() {
        aspecto = "Malo";
        ebriedad = 0;
        numeroDeDamiselas = 0;
    }

    public void tomarWhiskey() {
        ebriedad++;
    }

    public int queTanEbrioEstoy() { // Esto realmente es un get
        return ebriedad;

    }

    public void secuestrarDamisela(Humanos damisela) {
        if (numeroDeDamiselas < 5 && damisela.getSexo() == "Mujer") {

            this.damisela[numeroDeDamiselas] = damisela;
            numeroDeDamiselas++;
            System.out.println("El Villano ha secuestrado a " + damisela.getNombre());
        } else {

            System.out.println("Ya no puedes secuestrar mas damiselas");
        }
    
    


    }

    

}