package iniciante.uri2165;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String texto = input.nextLine();
		int tamanho = texto.length();
		
		if (tamanho <= 140) {
			System.out.println("TWEET");
		} else {
			System.out.println("MUTE");
		}

		input.close();
	}

}
