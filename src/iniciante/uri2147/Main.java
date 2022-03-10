package iniciante.uri2147;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int repete = input.nextInt();
		Double velocidade =  0.0;
		for (int i = 0; i < repete; i++) {
			String palavra = input.next();
			velocidade = palavra.length() * 0.01;
			
			System.out.println(String.format("%.2f",velocidade));
		}
		input.close();
	}

}
