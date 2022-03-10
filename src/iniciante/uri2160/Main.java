package iniciante.uri2160;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String texto = input.nextLine();
		int tamanho = texto.length();
		
		if (tamanho > 80) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

		input.close();
	}

}
