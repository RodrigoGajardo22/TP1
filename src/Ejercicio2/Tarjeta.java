package Ejercicio2;

public class Tarjeta {
//Atributos
	protected float cobertura;
	protected int propina;

	public Tarjeta(float cobertura, int propina) {
		this.cobertura = cobertura;
		this.propina = propina;
	}

	public boolean procesarPago(float montoBebida,float montoComida) {
		float monto = montoBebida+montoComida;
		float montoTotal= monto + monto*(propina/100);
		if (cobertura >= montoTotal) {
			cobertura = -montoTotal;
			return true;
		}
		return false;

	}

}
