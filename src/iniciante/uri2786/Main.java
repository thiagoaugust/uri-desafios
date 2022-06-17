package iniciante.uri2786;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		int c = input.nextInt();
		int l1 = l - 1;
		int c1 = c - 1;

		int tipo1 = (l * c) + (l1 * c1);
		int tipo2 = (l1 * 2) + (c1 * 2);

		System.out.println(tipo1);
		System.out.println(tipo2);
		input.close();
	}

}
