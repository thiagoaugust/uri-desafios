package iniciante.uri3047;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int m = input.nextInt();
		int f1 = input.nextInt();
		int f2 = input.nextInt();

		int f3 = m - (f1 + f2);
		int maior = 0;

		if (f3 > f1 && f3 > f2) {
			maior = f3;
		}else if(f2 > f3 && f2 > f1) {
			maior = f2;
		}else {
			maior = f1;
		}
		System.out.println(maior);
		input.close();
	}
}
