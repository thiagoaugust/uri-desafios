package iniciante.uri2235;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		boolean isPossibleA = (a + b) == c || a == b;
		boolean isPossibleB = (a + c) == b || a == c;
		boolean isPossibleC = (b + c) == a || c == b;
		
		if(isPossibleA || isPossibleB || isPossibleC) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
		System.out.println();
		input.close();
	}
}
