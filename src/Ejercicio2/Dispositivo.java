package Ejercicio2;

import java.util.List;
import java.util.Scanner;

public class Dispositivo {

	private Tarjeta tarjeta;
	private List<Bebida> listaBebidas;
	private List<Plato> listaPlatos;

	public Dispositivo(List<Bebida> listaBebidas, List<Plato> listaPlatos) { // debe cargar lista de comida y bebidas
		this.listaBebidas = listaBebidas;
		this.listaPlatos = listaPlatos;
	}

	public void seleccionarTarjeta(Tarjeta t) {
		this.tarjeta = t;
	}

	public String hacerPedido() {
		float valorBebidas = 0;
		float valorPlatos = 0;
		Scanner t1 = new Scanner(System.in);
		Scanner t2 = new Scanner(System.in);
		String s;
		String listaPedido = "";
		int n = 0;
		for (Bebida b : listaBebidas) {
			b.mostrarDatos();
			System.out.print("¿Seleccionar? S/N");
			s = t1.nextLine();
			if (s == "s") {
				System.out.print("Cantidad: ");
				n = t2.nextInt();
				valorBebidas = +b.costoTotal(n);
				listaPedido += b.mostrarDatos() + " cantidad: " + n + "\n";
			}
		}
		for (Plato p : listaPlatos) {
			p.mostrarDatos();
			System.out.print("¿Seleccionar? S/N");
			s = t1.nextLine();
			if (s == "s") {
				System.out.print("Cantidad: ");
				n = t2.nextInt();
				valorPlatos = +p.costoTotal(n);
				listaPedido += p.mostrarDatos() + " cantidad: " + n + "\n";
			}

		}

		if (realizarPago(valorBebidas, valorPlatos))
			return listaPedido;

		return "Monto insuficiente";

	}

	public boolean realizarPago(float montoBebidas, float montoPlatos) {

		return tarjeta.procesarPago(montoBebidas, montoPlatos);
	}

}
