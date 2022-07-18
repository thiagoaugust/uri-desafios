package iniciante.uri3342;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String numero = input.next();
		boolean test = false;
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '3' && i > 0) {
				if (numero.charAt(i - 1) == '1') {
					test = true;
					break;
				}
			}
		}
		if (test) {
			System.out.println(numero + " es de Mala Suerte");
		} else {
			System.out.println(numero + " NO es de Mala Suerte");
		}
		input.close();
	}

}
