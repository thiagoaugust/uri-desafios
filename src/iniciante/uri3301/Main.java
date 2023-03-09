package iniciante.uri3301;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int[] array = new int[3];

		menorValor(a, b, c, array);
		maiorValor(a, b, c, array);

		input.close();
	}

	private static void menorValor(int a, int b, int c, int[] array) {
		if (a < b && a < c) {
			array[0] = a;
		} else if (b < a && b < c) {
			array[0] = b;
		} else if (c < a && c < b) {
			array[0] = c;
		}
	}
	
	private static void maiorValor(int a, int b, int c, int[] array) {
		if (a < b && a < c) {
			array[2] = a;
		} else if (b < a && b < c) {
			array[2] = b;
		} else if (c < a && c < b) {
			array[2] = c;
		}
	}

}
