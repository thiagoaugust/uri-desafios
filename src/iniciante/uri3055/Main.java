package iniciante.uri3055;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int m = input.nextInt();
		
		int b = (m * 2)-a;
		
		System.out.println(b);
		input.close();
	}
}
