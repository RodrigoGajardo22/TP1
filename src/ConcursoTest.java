import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class ConcursoTest {

	private Concurso c1 = new Concurso(LocalDate.now(), LocalDate.now().plusDays(10));
	private Participante p1 = new Participante(LocalDate.now(), "Juan", 40635211); // Puede inscrirbirse y suma puntos
	private Participante p2 = new Participante(LocalDate.now().plusDays(2), "Alberto", 36849859); // Puede inscrirbirse
	private Participante p3 = new Participante(LocalDate.now().plusDays(12), "Cristina", 17647852);// No puede
	private Participante p4 = new Participante(LocalDate.now().minusDays(2), "Tomas", 1956371);// No puede

	@Test
	public void testInscripcion() {
		assertTrue(c1.inscribirParticipante(p1));
	}

	@Test
	public void testInscripcion2() {
		assertTrue(c1.inscribirParticipante(p2));
	}

	@Test
	public void testInscripcionFueraTermino() {
		assertTrue(c1.inscribirParticipante(p3));
	}

	@Test
	public void testInscripcionFueraTermino2() {
		assertTrue(c1.inscribirParticipante(p4));
	}

}
