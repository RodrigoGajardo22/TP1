import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Concurso {

	private Participante participantes[];
	private LocalDate fechaInicio, fechaFin;
	private int numParticipante;

	public Concurso() {
		participantes = new Participante[10];
		asignarFechas();
		numParticipante = 0;
	}

	public void cargarParticipante(LocalDate fecha) {

		if (puedeInscribirse(fecha)) {
			Participante p = new Participante(fecha);
			p.registrarDatos();
			participantes[numParticipante] = p;
			numParticipante++;
		} else
			System.out.println("Las incripciones se encuentran cerradas.");

	}

	private boolean puedeInscribirse(LocalDate fecha) {// si la fecha es valida, entonces True;

		if (fecha.isAfter(fechaInicio) || fecha.isBefore(fechaFin))
			return true;
		else
			return false;
	}

	private void asignarFechas() {

		fechaInicio = LocalDate.now();
		fechaFin = fechaInicio.plusDays(10);

	}

	public void mostrarParticipantes() {

		int i;
		if (numParticipante > 0)
			for (i = 0; i < numParticipante; i++) {
				System.out.println(i + 1 + " - " + participantes[i].mostrarDatos());
			}
		else
			System.out.println("Aun no hay participantes registrados.");
	}

}
