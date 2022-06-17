package iniciante.uri3302;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int cont = input.nextInt();
		String[] respostas = new String[cont];
		
		for (int i = 0; i < cont; i++) {
			String valorDigitado = input.next();
			int c = i+1;
			respostas[i] = "resposta " + c + ": " + valorDigitado;
		}

		for (int i = 0; i < cont; i++) {
			System.out.println(respostas[i]);
		}

		input.close();
	}

}
