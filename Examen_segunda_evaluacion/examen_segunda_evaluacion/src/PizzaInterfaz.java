// Interfaz Pizza
public interface PizzaInterfaz {

    static final int MAX_INGREDIENTES = 5;

    //Función que agrega un ingrediente al array de ingredientes
    boolean agregarIngrediente(String ingrediente);

    //Función para eliminar un ingredinte del array de ingredientes. Sobreescribir posición eliminada.
    boolean borrarIngrediente(String ingrediente);

    //sobreescritura del método toString de Object, para mostrar los datos de la pizza.
    String toString();    
}