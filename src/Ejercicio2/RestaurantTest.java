package Ejercicio2;

import org.junit.Assert;
import org.junit.Test;

public class RestaurantTest {
	float montoComidas1 = 5500;
	float montoBebidas1 = 3200;

	float montoComidas2 = 14000;
	float montoBebidas2 = 10000;

	Tarjeta tarjetaVisa = new Visa(20000, 5);
	Tarjeta tarjetaMaster = new MasterCard(15000, 5);
	Tarjeta tarjetaComarca = new ComarcaPlus(12000, 5);
	Tarjeta tarjetaViedma = new Viedma(12000, 5);

	@Test
	public void testVisa() {

		float resultado = tarjetaVisa.calculo(montoBebidas1, montoComidas1);
		float valorEsperado = 9034.2f;

		Assert.assertTrue(valorEsperado == resultado);
	}

	@Test
	public void testMaster() {

		float resultado = tarjetaMaster.calculo(montoBebidas1, montoComidas1);
		float valorEsperado = 9019.5f;

		Assert.assertTrue(valorEsperado == resultado);

	}

	@Test
	public void testComarca() {

		float resultado = tarjetaComarca.calculo(montoBebidas1, montoComidas1);
		float valorEsperado = 8952.3f;

		Assert.assertTrue(valorEsperado == resultado);

	}

	@Test
	public void testViedma() {

		float resultado = tarjetaViedma.calculo(montoBebidas1, montoComidas1);
		float valorEsperado = 9135f;

		Assert.assertTrue(valorEsperado == resultado);

	}

	@Test
	public void testCoberturaInsuficiente() {

		float resultado = tarjetaViedma.calculo(montoBebidas2, montoComidas2);

		Assert.assertTrue(12000 < resultado);

	}

	@Test
	public void testCoberturaSuficiente() {

		float resultado = tarjetaViedma.calculo(montoBebidas1, montoComidas1);

		Assert.assertTrue(12000 >= resultado);

	}

}
