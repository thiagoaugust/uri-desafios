package iniciante.uri2896;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int repete = input.nextInt();

		for (int i = 0; i < repete; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			if (n < k) {
				System.out.println(n);
			} else {
				int resultado = n/k;
				int resto = n%k;
				System.out.println(resultado+resto);
			}
		}

		input.close();
	}

}
