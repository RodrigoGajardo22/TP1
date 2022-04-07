import java.time.LocalDate;
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

		if (puedeInscribirse()) {
			p.sumarPuntos();
			listParticipantes.add(p);
			numParticipante++;
			return true;
		} else {
			return false;
		}

	}

	private boolean puedeInscribirse() {// si la fecha es valida, entonces True;

		LocalDate fechaHoy = LocalDate.now();

		if (fechaHoy.equals(fechaInicio))
			return true;
		if (fechaHoy.isAfter(fechaInicio) && fechaHoy.isBefore(fechaFin))
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
