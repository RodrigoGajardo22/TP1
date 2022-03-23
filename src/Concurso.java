import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class Concurso {

	private List<Participante> listParticipantes;
	private LocalDate fechaInicio, fechaFin;
	private int numParticipante;

	public Concurso(LocalDate fechaIni, LocalDate fechaFin) {
		this.fechaInicio = fechaIni;
		this.fechaFin = fechaFin;
		listParticipantes = new ArrayList<Participante>();
		numParticipante = 0;
	}

	public boolean inscribirParticipante(Participante p) {

		
		if (puedeInscribirse(p.getFecha())) { // Si en la fehca de hoy se puede inscribir...
			p.sumarPuntos(fechaInicio);
			listParticipantes.add(p);
			numParticipante++;
			return true;
		} else {
		//	System.out.println(" Las incripciones se encuentran cerradas.");
			return false;
		}

	}

	private boolean puedeInscribirse(LocalDate fecha) {// si la fecha es valida, entonces True;
		
		if (fecha.equals(fechaInicio))
			return true;
		if (fecha.isAfter(fechaInicio) && fecha.isBefore(fechaFin))
			return true;

		return false;
	}

	public void mostrarParticipantes() {

		int i = 1;
		if (numParticipante > 0)
			for (Participante p : listParticipantes) {
				System.out.println(i + " - " + p.mostrarDatos());
				i++;
			}
		else
			System.out.println("Aun no hay participantes registrados.");
	}

}
