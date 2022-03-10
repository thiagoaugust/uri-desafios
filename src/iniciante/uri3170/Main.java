package iniciante.uri3170;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int bolinhasQuePossui = input.nextInt();
		int galhos = input.nextInt();
		if(galhos%2!=0) {
			galhos--;
		}
		int resultado = (galhos / 2) - bolinhasQuePossui;

		if (resultado <= 0) {
			System.out.println("Amelia tem todas bolinhas!");
		} else {
			System.out.println("Faltam " + resultado + " bolinha(s)");
		}
		input.close();
	}

}
