package iniciante.uri3146;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		double a = input.nextDouble();

		double resultado = 2 * 3.14 * a;
		System.out.println(String.format("%.2f",resultado).replace(",", "."));
		input.close();
	}

}
