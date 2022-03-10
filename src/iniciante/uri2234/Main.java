package iniciante.uri2234;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double totalHotDogs = input.nextInt();
		double totalParticipantes = input.nextInt();

		double total = totalHotDogs / totalParticipantes;
		System.out.println(String.format("%.2f", total));

		input.close();
	}

}
