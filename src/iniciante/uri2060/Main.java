package iniciante.uri2060;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int numeroDeTestes = input.nextInt();
		int[] contadorMultiplos = new int[4];
		
		for (int i = 0; i < numeroDeTestes; i++) {
			int numero = input.nextInt();
			
			for (int j = 2; j <= 5; j++) {
				if (numero % j == 0) {
					contadorMultiplos[j-2]++;
				}
			}
		}
		
		System.out.println(contadorMultiplos[0]+" Multiplo(s) de 2");
		System.out.println(contadorMultiplos[1]+" Multiplo(s) de 3");
		System.out.println(contadorMultiplos[2]+" Multiplo(s) de 4");
		System.out.println(contadorMultiplos[3]+" Multiplo(s) de 5");

		input.close();
	}

}
