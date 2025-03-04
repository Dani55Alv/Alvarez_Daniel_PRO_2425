public class Guerrero extends Personaje {

    private int fuerza;

    public Guerrero(String nombre, int nivel, int vida, int velocidad, int fuerza) {
        super(nombre, nivel, vida, velocidad); // pasa los parámetros al constructor de la clase padre
        nombre = getNombre();
        nivel = getNivel();
        vida = getVida();
        velocidad = getVelocidad();
        this.fuerza = fuerza; // Atributo adicional del guerrero
   
    }
//Hacer construtor vacio 
    @Override

    void atacar(Personaje objetivo) {
        int ataqueGuerrero = 0;

        ataqueGuerrero = (fuerza * getNivel()) / getVida(); //Los get pueden tener this.

        if (objetivo instanceof Arquero) {
            ataqueGuerrero = ataqueGuerrero * 2;
        }

        System.out.println("Personaje "+ getNombre()+ " ataca a personaje " + objetivo.getNombre());  // Nombres atacante y presa y cantidad de daño.
      
      objetivo.setVida(objetivo.getVida()- ataqueGuerrero);
      
        // retunr objteivo.recibirGolpe(danio)
    } // ¡OJO! Atacar llamar recibir golpe. "vida -= danio";

    // compareTo() y toString() necesitas sobrescribir es decir poner override.

    @Override
    public String toString() {
        // llama al método toString() de la clase padre y añade la fuerza
        return super.toString() + ", Fuerza: " + fuerza;
    }

}
