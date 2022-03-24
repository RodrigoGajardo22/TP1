package Ejercicio2;

public class Visa extends Tarjeta{
	private final double descuento = 0.03;

	public Visa(float cobertura, int propina) {
		super(cobertura, propina);
		
	}
	
	public boolean procesarPago(float montoBebida,float montoComida) {
		double monto = (montoBebida-(montoBebida*descuento))+montoComida;
		float montoTotal= (float) (monto + monto*(propina/100));
		if (cobertura >= montoTotal) {
			cobertura = -montoTotal;
			return true;
		}
		return false;

	}

	
	

}
