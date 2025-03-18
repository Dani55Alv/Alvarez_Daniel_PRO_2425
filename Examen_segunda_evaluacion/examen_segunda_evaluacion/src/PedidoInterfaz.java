// Interfaz Pedido
public interface PedidoInterfaz{

    //Operaciones directas
    void agregarPizza(Pizza pizza);
    boolean eliminarPizza(Pizza pizza);
    
    //Implementar con Iterator
    boolean eliminarPizza(String nombre);
    abstract double calcularPrecio();
    
    //Sobreescritura de métodos de Object
    boolean equals(Object obj);
    int hashCode();
    String toString();
    
    //Sobreescritura de método de Comparable
    int compareTo(Pedido pedido);
}