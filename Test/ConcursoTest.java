import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class ConcursoTest {

	private Participante p1 = new Participante("Juan Fuentes", 40635211); // Puede inscrirbirse y suma puntos
	private Participante p2 = new Participante("Alberto Garcia", 36849859); // Puede inscrirbirse
	private Participante p3 = new Participante("Cristina Entraigas", 17647852);// No puede

	@Test
	public void testInscripcion() { // concurso abierto hace 3 dias

		Concurso c1 = new Concurso(LocalDate.now().minusDays(3), LocalDate.now().plusDays(10));

		assertTrue(c1.inscribirParticipante(p1));
	}

	@Test
	public void testInscripcionHoy() {// Concurso abrió hoy

		Concurso c = new Concurso(LocalDate.now(), LocalDate.now().plusDays(7));
		assertTrue(c.inscribirParticipante(p2));
	}

	@Test
	public void testInscripcionFueraTermino() { // No puede inscribirse

		Concurso c = new Concurso(LocalDate.now().plusDays(2), LocalDate.now().plusDays(12));
		assertTrue(!c.inscribirParticipante(p3));
	}

}
