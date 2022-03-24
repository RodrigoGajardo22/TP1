package Ejercicio2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class RestaurantTest {
	List<Bebida> listaDeBebidas = new ArrayList<Bebida>();
	List<Plato> listaDePlatos = new ArrayList<Plato>();
	
	Bebida coca = new Bebida("Cocacola",15);
	
	Dispositivo dispositivo= new Dispositivo(listaDeBebidas,listaDePlatos);
	Tarjeta tarjeta = new Visa(400,3);
	
	@Test
	public void test() {
		dispositivo.seleccionarTarjeta(tarjeta);
		assertTrue(dispositivo.realizarPago(100, 100));
	}
	
	@Test
	public void test2() {
		dispositivo.seleccionarTarjeta(tarjeta);
		assertTrue(dispositivo.realizarPago(400, 100));
	}
	
	
	

}
