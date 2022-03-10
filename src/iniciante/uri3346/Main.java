package iniciante.uri3346;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double f1 = input.nextDouble();
		double f2 = input.nextDouble();
		double resultado = ((((1.0 + f1/100.00) * (1.0 + f2/100.00)) - 1.0) * 100.0);
		System.out.println(String.format("%.6f", resultado));

		input.close();
	}

}
