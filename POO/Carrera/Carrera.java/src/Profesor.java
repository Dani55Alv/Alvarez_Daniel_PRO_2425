public class Profesor {
private String nombre;
private int legajo;
private double basico;
private int angitguedad;

public Profesor(String nombre, int legajo, double basico, int angitguedad) {
    this.nombre = nombre;
    this.legajo = legajo;
    this.basico = basico;
    this.angitguedad = angitguedad;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getLegajo() {
    return legajo;
}

public void setLegajo(int legajo) {
    this.legajo = legajo;
}

public double getBasico() {
    return basico;
}

public void setBasico(double basico) {
    this.basico = basico;
}

public int getAngitguedad() {
    return angitguedad;
}

public void setAngitguedad(int angitguedad) {
    this.angitguedad = angitguedad;
}



}
