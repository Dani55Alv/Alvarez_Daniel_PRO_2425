// Clase Main para pruebas
public class App {
    public static void main(String[] args) {
        /*
         * Restaurante restaurante = new Restaurante();
         * 
         * Pedido p1 = new PedidoOnline(1, "Calle Plaza 8");
         * 
         * Pizza pizza1 = new Pizza("Margarita", 10.50);
         * pizza1.agregarIngrediente("Queso");
         * pizza1.agregarIngrediente("Bacon");
         * p1.agregarPizza(pizza1);
         * 
         * Pizza pizza2 = new Pizza("Cuatro Quesos", 12.00);
         * pizza2.agregarIngrediente("Queso");
         * pizza2.agregarIngrediente("Queso");
         * p1.agregarPizza(pizza2);
         * 
         * restaurante.agregarPedido(p1);
         * System.out.println(p1);
         * 
         * Pedido p2 = new PedidoOnline(2, "Calle Mayor 10");
         * 
         * Pizza pizza3 = new Pizza("Barbacoa", 12.00);
         * pizza3.agregarIngrediente("Pollo");
         * pizza3.agregarIngrediente("Bacon");
         * p2.agregarPizza(pizza3);
         * 
         * restaurante.agregarPedido(p2);
         * System.out.println(p2);
         * 
         * //restaurante.mostrarPedidos();
         */

        Restaurante restaurante = new Restaurante();

        // Crear pedidos online
        PedidoOnline pedido1 = new PedidoOnline(1, "Calle 123");
        PedidoOnline pedido2 = new PedidoOnline(2, "Avenida 456");

        // Crear pizzas y agregar ingredientes
        Pizza pizza1 = new Pizza("Margarita", 8.5);
        pizza1.agregarIngrediente("Tomate");
        pizza1.agregarIngrediente("Queso");

        Pizza pizza2 = new Pizza("Pepperoni", 9.5);
        pizza2.agregarIngrediente("Tomate");
        pizza2.agregarIngrediente("Queso");
        pizza2.agregarIngrediente("Pepperoni");

        // Agregar pizzas a pedidos
        pedido1.agregarPizza(pizza1);
        pedido1.agregarPizza(pizza2);
        pedido2.agregarPizza(pizza1);

        // Agregar pedidos al restaurante
        restaurante.agregarPedido(pedido1);
        restaurante.agregarPedido(pedido2);

        // Mostrar pedidos actuales
        System.out.println("\nPedidos actuales:");
        restaurante.mostrarPedidos();

        // Eliminar una pizza de un pedido
        pedido1.eliminarPizza(pizza2);

        // Actualizar el pedido en el restaurante
        restaurante.actualizarPedido(pedido1);

        // Mostrar pedidos después de la actualización
        System.out.println("\nPedidos después de la actualización:");
        restaurante.mostrarPedidos();

        // Eliminar un pedido
        restaurante.eliminarPedido(2);

        // Mostrar pedidos después de eliminar
        System.out.println("\nPedidos después de eliminar un pedido:");
        restaurante.mostrarPedidos();
    }
}
