public class Arquero extends Personaje{
private int precision;

public Arquero(String nombre, int nivel, int vida, int velocidad, int precision) {
    super(nombre, nivel, vida, velocidad); // pasa los parámetros al constructor de la clase padre
    nombre = getNombre();
    nivel = getNivel();
    vida = getVida();
    velocidad = getVelocidad();
    this.precision = precision;  // Atributo adicional del arquero

}
// Hacer construtor vacio

@Override

void atacar(Personaje objetivo) {
    int ataqueArquero = 0;

    ataqueArquero = (precision *  getNivel() )/100;


    if (objetivo instanceof Arquero) {
     ataqueArquero= ataqueArquero*2;
    }


    System.out.println("Personaje " + getNombre() + " ataca a personaje " + objetivo.getNombre());
    objetivo.setVida(objetivo.getVida() - ataqueArquero);

}


@Override
public String toString() {
    // llama al método toString() de la clase padre y añade la fuerza
    return super.toString() + ", Precision: " + precision;
}
}
