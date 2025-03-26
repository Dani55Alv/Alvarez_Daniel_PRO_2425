
// Clase Pizza. Implementa PizzaInterfaz
import java.util.Arrays;
import java.util.*;

public class Pizza implements PizzaInterfaz {
    private String nombre;
    private double precio;
    private static final int MAX_INGREDIENTES = 5;
    private String[] ingredientes;
    private int numIngredientes;

    public Pizza(String nombre, double precio, String[] ingredientes, int numIngredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.numIngredientes = numIngredientes;
    }

    // El constructor que pide el main.
    public Pizza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
     this.numIngredientes=0;
     this.ingredientes = new String [MAX_INGREDIENTES];

    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public int getNumIngredientes() {
        return numIngredientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setNumIngredientes(int numIngredientes) {
        this.numIngredientes = numIngredientes;
    }

    @Override
    public boolean agregarIngrediente(String ingrediente) {
        boolean NoPuedeAgregarse = true;

        if (numIngredientes < MAX_INGREDIENTES) {
             NoPuedeAgregarse = false;

        }

        if (NoPuedeAgregarse == true) {
            System.out.println("No se puede agregar el ingrediente " + ingrediente + " no cabe");

        } else {

            System.out.println("Ingrediente: " + ingrediente + " si se puede agregar ");
            this.ingredientes[numIngredientes] = ingrediente;
            numIngredientes++;

        }
        return NoPuedeAgregarse;
    }

    @Override
    public boolean borrarIngrediente(String ingrediente) {
        boolean noExiste = true;
        for (String ingredientesPizza : ingredientes) {
            if (ingredientesPizza.equals(ingrediente)) {
                noExiste = false;
            }
        }

        if (noExiste) {
            System.out.println("No existe el ingrediente a borrar " + ingrediente);

        } else {

            System.out.println("Ingrediente: " + ingrediente + " encontrado con exito ");
            String ingredienteDetectado = null;
            boolean encontrado = true;
            for (int i = 0; i < numIngredientes && encontrado; i++) {
                if (ingredientes[i].equals(ingrediente)) {

                    ingredienteDetectado = ingredientes[i];
                    encontrado = false;
                    ingredientes[i] = null;
                    // Ordenacion

                    for (int j = i; j < numIngredientes - 1; j++) {
                        ingredientes[j] = ingredientes[j + 1];
                    }
                    numIngredientes--;

                }

            }

        }
        return noExiste;
    }

    @Override
    public String toString() {
        return "NombrePizza: " + nombre + " Precio: " + precio + " Numero de ingredientes: " + numIngredientes
                + " Ingredientes: " + Arrays.toString(ingredientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pizza otraPizza = (Pizza) obj;
        return nombre.equals(otraPizza.nombre);
    }

}