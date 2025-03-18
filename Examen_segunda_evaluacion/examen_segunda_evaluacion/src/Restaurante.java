
// Clase Restaurante
import java.util.*;

//Añadir el import del tipo de mapa seleccionado

public class Restaurante implements GestionPedidos {
	private Map<Integer, Pedido> mapaPedidos;
	private Integer id;

	public Restaurante() {
		this.mapaPedidos = new LinkedHashMap<>();
	}

	@Override
	public void agregarPedido(Pedido pedido) {
		mapaPedidos.put(this.id, pedido);
	}

	public boolean eliminarPedido(int idPedido) {

		boolean encotrado = false;
		for (Integer ides : mapaPedidos.keySet()) {

			if (ides == idPedido) {
				mapaPedidos.remove(ides);
				encotrado = true;
			}
		}

		return encotrado;
	}

	public Pedido obtenerPedido(int idPedido) {

		for (Integer ides : mapaPedidos.keySet()) {
			if (ides.equals(idPedido)) {
				System.out.println(ides);
				return mapaPedidos.get(idPedido);
			}
		}
		return null;
	}

	public boolean actualizarPedido(Pedido pedido) {
		boolean existe = false;
		for (Pedido pedidos : mapaPedidos.values()) {
			if (pedidos.equals(pedido)) {
				System.out.println(pedidos);
				mapaPedidos.put(this.id, pedido);
				System.out.println("Acrualizado--> " + pedidos);

				existe = true;
			}
		}
		return existe;
	}

	public void mostrarPedidos() {
		for (Map.Entry<Integer, Pedido> pedidos : mapaPedidos.entrySet()) {
			Integer id = pedidos.getKey();
			Pedido pedido = pedidos.getValue();
			System.out.println("El id " + id + " es el pedido: " + pedido);
		}
	}

}
