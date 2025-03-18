// Pedido Online. Extiende de Pedido

import java.util.LinkedList;
import java.util.List;

public class PedidoOnline extends Pedido {

	private String direccionEntrega;

	public PedidoOnline(String direccionEntrega, int idPedido, List<Pizza> IPizzas) {
		//super(idPedido, IPizzas);
		this.direccionEntrega = direccionEntrega;
		this.idPedido = idPedido;
		this.IPizzas = new LinkedList<>();
	}

	@Override
	public double calcularPrecio(){
		double precioTotal=0;

		for ( Pizza  pizzas : this.IPizzas) {
			precioTotal+=	pizzas.getPrecio();
			precioTotal+= pizzas.getNumIngredientes()*2;
		}
	

	System.out.println("El precio total del pedido es  "+precioTotal);
return precioTotal;
}

	@Override
	public String toString() {
		return super.toString() + "Id direccion entrega: " + direccionEntrega;
	}

}