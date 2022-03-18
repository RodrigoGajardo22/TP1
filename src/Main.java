import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Concurso c = new Concurso();

		LocalDate fecha = LocalDate.now();

		int n = 1;
		Scanner teclado = new Scanner(System.in);

		while (n != 0) {// Menu
			System.out.println("Eliga una opcion: ");
			System.out.println("1 - Inscribir Participante");
			System.out.println("2 - Mostrar Inscriptos ");
			System.out.println("0 - Finalizar. ");
			n = teclado.nextInt();
			if (n == 1)
				c.cargarParticipante(fecha);
			else if (n == 2)
				c.mostrarParticipantes();

		}
		System.out.println("Finalizado.");

	}

}
