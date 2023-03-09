package iniciante.uri2850;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in).useDelimiter("\n");

		while (true) {

			try {
				String entrada = input.next();
				if ("esquerda".equals(entrada)) {
					System.out.println("ingles");
				} else if ("direita".equals(entrada)) {
					System.out.println("frances");
				} else if ("nenhuma".equals(entrada)) {
					System.out.println("portugues");
				} else {
					System.out.println("caiu");
				}
			} catch (Exception e) {
				break;
			}

		}

	}
}
