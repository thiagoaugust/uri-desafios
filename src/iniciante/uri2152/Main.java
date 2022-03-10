package iniciante.uri2152;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int repete = input.nextInt();

		for (int i = 0; i < repete; i++) {
			String hora = input.next();
			String minuto = input.next();
			int ligado = input.nextInt();

			if (hora.length() == 1) {
				hora = "0" + hora;
			}

			if (minuto.length() == 1) {
				minuto = "0" + minuto;
			}

			if (ligado == 1) {
				System.out.println(hora + ":" + minuto + " - A porta abriu!");
			} else {
				System.out.println(hora + ":" + minuto + " - A porta fechou!");
			}
		}

		input.close();
	}

}
