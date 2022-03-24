package Ejercicio2;

public class ComarcaPlus extends Tarjeta{
	private final double descuento = 0.02;

	public ComarcaPlus(float cobertura, int propina) {
		super(cobertura, propina);

	}

	public boolean procesarPago(float montoBebida, float montoComida) {
		double monto = montoBebida + montoComida;
		monto = monto - monto*descuento;
		float montoTotal = (float) (monto + monto * (propina / 100));
		if (cobertura >= montoTotal) {
			cobertura = -montoTotal;
			return true;
		}
		return false;

	}
}

