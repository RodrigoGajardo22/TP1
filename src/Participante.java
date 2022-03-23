import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Participante {

	private int puntos;
	private LocalDate fecha; // fecha en la que el participante quiere inscribirse
	private String nombre;
	private int dni;

	public Participante(LocalDate fechaInscripcion, String nombre, int dni) {

		this.fecha = fechaInscripcion;
		this.nombre = nombre;
		this.dni = dni;
		puntos = 0;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void sumarPuntos(LocalDate fecha) {
		if (this.fecha.equals(fecha))
			puntos = +10;
	}

	/*
	 * public void registrarDatos() { Scanner teclado = new Scanner(System.in);
	 * 
	 * System.out.println("Ingrese su nombre y apellido: "); nombre =
	 * teclado.nextLine();
	 * 
	 * System.out.println("Ingrese su DNI: "); dni = teclado.nextLine();
	 * 
	 * System.out.println("Datos cargados."); }
	 */

	public String mostrarDatos() {
		if (nombre != null)
			return "Nombre y Apellido: " + nombre + " DNI: " + dni + " Puntos: " + puntos;
		else
			return "No se encontraron datos.";
	}

}
