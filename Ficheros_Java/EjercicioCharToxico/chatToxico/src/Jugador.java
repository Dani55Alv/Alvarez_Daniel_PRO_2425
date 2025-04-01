import java.util.Objects;

public class Jugador {
private String nombreJugador;
private int puntos_baneo;
private int puntos_baneo_MAX;

    public Jugador(String nombreJugador){
  this.nombreJugador= nombreJugador;
  this.puntos_baneo=0;
this.puntos_baneo_MAX =5;
    
    }

    public int getPuntos_baneo() {
        return puntos_baneo;
    }




    @Override
    public boolean equals(Object obj){
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false ;
    Jugador otroJugadorNombre = (Jugador) obj;
    return nombreJugador.equals(otroJugadorNombre.nombreJugador);
}

@Override 
public int hashCode(){
return Objects.hash(nombreJugador);
}

public void setPuntos_baneo(int puntos_baneo) {
    this.puntos_baneo = puntos_baneo;
}


public String getNombreJugador() {
    return nombreJugador;
}

@Override
public String toString(){
    return nombreJugador;
}


    }

