package iniciante.uri3299;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int brancas = 0;
		int pretas = 0;
		boolean wow = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				wow = !wow;
				if (wow == true) {
					pretas++;
				} else {
					brancas++;
				}
			}
		}
		System.out.println(brancas + " casas brancas e " + pretas + " casas pretas");
		input.close();
	}

}
