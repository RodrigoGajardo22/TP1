package Ejercicio2;

public class MasterCard extends Tarjeta {
	private final double descuento = 0.02;

	public MasterCard(float cobertura, int propina) {
		super(cobertura, propina);

	}

	public boolean procesarPago(float montoBebida, float montoComida) {
		double monto = (montoComida - (montoComida * descuento)) + montoBebida;
		float montoTotal = (float) (monto + monto * (propina / 100));
		if (cobertura >= montoTotal) {
			cobertura = -montoTotal;
			return true;
		}
		return false;

	}
}
