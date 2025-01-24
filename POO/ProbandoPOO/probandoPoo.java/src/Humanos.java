/* 
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
*/



/**
 * 
 * 
 * @autor Daniel Alvarez Morales
 * @version 1.0
 * @Class Humanos Clase para humanos
 * 
 * 
 */
public class Humanos {
    int piernas;
    int brazos;
    int ojos;
    int nariz;
    int boca;
    String nombre;
    String sexo;
    String nombreCaballo;
    String preferenciaWhiskey;
    boolean muertoOvivo;

    public Humanos() {
        piernas = 2;
        brazos = 2;
        ojos = 2;
        nariz = 1;
        boca = 1;
        muertoOvivo = true;

    }

    // Set para piernas
    public void setPiernas(int piernas) {
        this.piernas = piernas;
    }

    // Get para piernas
    public int getPiernas() {
        return piernas;
    }

    public int getBrazos() {
        return brazos;
    }

    public void setBrazos(int brazos) {
        this.brazos = brazos;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public int getNariz() {
        return nariz;
    }

    public void setNariz(int nariz) {
        this.nariz = nariz;
    }

    public int getBoca() {
        return boca;
    }

    public void setBoca(int boca) {
        this.boca = boca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombreCaballo() {
        return nombreCaballo;
    }

    public void setNombreCaballo(String nombreCaballo) {
        this.nombreCaballo = nombreCaballo;
    }

    public String getPreferenciaWhiskey() {
        return preferenciaWhiskey;
    }

    public void setPreferenciaWhiskey(String preferenciaWhiskey) {
        this.preferenciaWhiskey = preferenciaWhiskey;
    }

    public String comoTeLlamas() {
        return nombre;

    }

    public boolean isMuertoOvivo() {
        return muertoOvivo;
    }

    public void setMuertoOvivo(boolean muertoOvivo) {
        this.muertoOvivo = muertoOvivo;
    }
}