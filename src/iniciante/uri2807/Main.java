package iniciante.uri2807;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		int[] fibonacci = new int[a];

		if(a == 1) {
			System.out.print(1);
		}else if(a == 2) {
			System.out.print("1 1");
		}else {
			fibonacci[0] = 1;
			fibonacci[1] = 1;
			for (int i = 2; i < a; i++) {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			}

			for (int i = a - 1; i >= 0; i--) {
				if (i == 0) {
					System.out.print(fibonacci[i]);
				} else {
					System.out.print(fibonacci[i] + " ");
				}
			}
		}
		System.out.println();

		input.close();
	}
}
