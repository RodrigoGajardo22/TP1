package Ejercicio2;

public class Tarjeta {
//Atributos
	protected float cobertura;
	protected int propina;

	public Tarjeta(float cobertura, int propina) {
		this.cobertura = cobertura;
		this.propina = propina;
	}

	public boolean procesarPago(float montoBebida, float montoComida) {

		float montoTotal = calculo(montoBebida, montoComida);
		if (cobertura >= montoTotal) {
			cobertura = -montoTotal;
			return true;
		}
		return false;

	}

	public float calculo(float montoBebida, float montoComida) {

		float monto = montoBebida + montoComida;
		return monto + monto * propina / 100;

	}
}
