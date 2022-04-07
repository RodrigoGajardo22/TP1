public class Participante {

	private int puntos;
	private String nombreYApellido;
	private int dni;

	public Participante(String nombreYApellido, int dni) {

		this.nombreYApellido = nombreYApellido;
		this.dni = dni;
		puntos = 0;
	}

	public void sumarPuntos() {
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
		if (nombreYApellido != null)
			return "Nombre y Apellido: " + nombreYApellido + " DNI: " + dni + " Puntos: " + puntos;
		else
			return "No se encontraron datos.";
	}

}
