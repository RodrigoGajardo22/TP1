package Ejercicio2;

public class MasterCard extends Tarjeta {
	private final double descuento = 0.02;

	public MasterCard(float cobertura, int propina) {
		super(cobertura, propina);

	}

	public float calculo(float montoBebida, float montoComida) {
		float montoComidaConDescuento = (float) (montoComida - montoComida * descuento);

		float subTotal = montoBebida + montoComidaConDescuento;

		return subTotal + subTotal * propina / 100;
	}
}
