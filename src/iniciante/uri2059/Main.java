package iniciante.uri2059;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int p = input.nextInt();
		int jogador1 = input.nextInt();
		int jogador2 = input.nextInt();
		int r = input.nextInt();
		int a = input.nextInt();

		int soma = jogador1 + jogador2;
		boolean isPegoRoubando = r == 1 && a == 1;
		boolean isRoubo = r == 1 && a == 0;
		boolean escolheuPar = p == 1;
		boolean escolheuImpar = p == 0;

		boolean isPar = soma % 2 == 0;

		if ((escolheuPar && isPar && !isPegoRoubando) || (escolheuImpar && !isPar) || isRoubo) {
			System.out.println("Jogador 1 ganha!");
		} else {
			System.out.println("Jogador 2 ganha!");
		}

		input.close();
	}

}
