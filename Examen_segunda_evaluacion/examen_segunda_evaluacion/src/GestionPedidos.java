// Interfaz GestionPedidos
public interface GestionPedidos {
    
    //Operaciones CRUD para el mapa
    void agregarPedido(Pedido pedido);
    boolean eliminarPedido(int idPedido);
    Pedido obtenerPedido(int idPedido);
    boolean actualizarPedido(Pedido pedido);
    
    //Mostrar el pedido. Usar forEach
    void mostrarPedidos();
}