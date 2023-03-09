package iniciante.uri2863;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		while(true) {
			try {
				int a = input.nextInt();
				List<Double> numeros = new ArrayList<>();

				for (int i = 0; i < a; i++) {
					numeros.add(input.nextDouble());
				}
				
				Collections.sort(numeros);
				
				System.out.println(numeros.get(0));
			} catch (Exception e) {
				
				input.close();
				break;
			}
		}
		
	}
}
