

public abstract class  Personaje {


    private String nombre;
   private int nivel;
   private int vida;
   private int velocidad;

//Utilizamos el constructor con getters debido a que si no tendriamos que usar protected, sin embargo es 
//buena practica usar private.

    public Personaje(String nombre, int nivel, int vida, int velocidad) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.velocidad = velocidad;
    }


//Tenemos el constructor de personaje vacio por si acaso.

    public Personaje() {

    }
    

//Reescribir el attaque del personaje en la clase guerrero y arquero

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNivel() {
        return nivel;
    }


    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public int getVida() {
        return vida;
    }


    public void setVida(int vida) {
        this.vida = vida;
    }


    public int getVelocidad() {
        return velocidad;
    }


    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

//Este metodo es abstracto ya que cada personaje es guerro o arquero es decir una clase
//Y cada clase tiene su propia logica de implementación al atacar. (Uno por fuerza y otra por precisión)
    abstract void  atacar(Personaje objetivo);

     void recibirGolpe(){

         this.vida--;

        if (this.vida<0) {
            
        }

     }

     @Override

//Si bas ha hacer un sout para mostrar los datos de un personaje o objeto solo te mostrara la dirección de objeto.
// Hereda de la  clase "object", para mostrar realmente los datos del personaje.
public String toString() {
    return "Nombre: " + nombre + ", Nivel: " + nivel + ", Vida: " + vida + ", Velocidad: " + velocidad;
}

//Tambien podrias hacer un void mostrar personaje y hacer un sout de cada dato.

}
// retunr super.toString() + " Fuerza " + this.fuerza  