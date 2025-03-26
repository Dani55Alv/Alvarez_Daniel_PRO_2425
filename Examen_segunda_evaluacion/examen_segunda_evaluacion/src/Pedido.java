
// Clase abstracta Pedido. . Implementa PedidoInterfaz
import java.util.*;

//Añadir imports de la collección seleccionada

public abstract class Pedido implements Comparable<Pedido>, PedidoInterfaz {
	protected int idPedido;
	protected List<Pizza> IPizzas;
	protected static int idPedidoContador;

	public Pedido() {
		this.IPizzas = new LinkedList<>();
		this.idPedido = idPedido;
		idPedidoContador++;
	}

	@Override
	public void agregarPizza(Pizza pizza) {
		this.IPizzas.add(pizza);
	}

	public boolean eliminarPizza(Pizza pizza) {
		boolean noExiste = true;

		for (Pizza pizzas : this.IPizzas) {
			if (pizzas.equals(pizza)) {
				noExiste = false;
				this.IPizzas.remove(pizzas);
			}
		}
		if (noExiste) {
			System.out.println("No existe la pizza a borrar " + pizza);
		}
		return noExiste;
	}

	// Implementar con Iterator

	public boolean eliminarPizza(String nombre) {

		boolean noExiste = true;

		for (Pizza pizzas : this.IPizzas) {
			if (pizzas.getNombre().equals(nombre)) {
				noExiste = false;

			}
		}

		if (noExiste) {
			System.out.println("No existe la pizza a borrar por nombre " + nombre);
		} else {

			Iterator<Pizza> IteratorP = IPizzas.iterator();

			while (IteratorP.hasNext()) {
				// Pizza pizza = IteratorP.next faltaba esto IMP
				// String nombre = iterador.next(); // Obtiene el siguiente elemento
				if (IteratorP.next().getNombre().equals(nombre)) {
					IteratorP.remove();

				}
			}
		}
		return noExiste;

	}

	public abstract double calcularPrecio();

	@Override
	public String toString() {
		return "Id pedido: " + idPedido + " Lista: " + IPizzas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Pedido otroPedido = (Pedido) obj;
		return idPedido == (otroPedido.idPedido);
	}

	@Override
	// Sobreescritura de método de Comparable
	public int compareTo(Pedido pedido) {
		return Integer.compare(this.idPedido, pedido.idPedido);
	}// comparteTo cuando es string?

}
