package iniciante.uri2587;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int repete = input.nextInt();
		for (int i = 0; i < repete; i++) {

			String A = input.next();
			String B = input.next();
			String C = input.next();

			List<String> Af = new ArrayList<>();
			List<String> Bf = new ArrayList<>();

			char[] Cchar = C.toCharArray();
			for (int j = 0; j < Cchar.length; j++) {
				if (Cchar[j] == '_') {
					Af.add(A.substring(j, j + 1));
					Bf.add(B.substring(j, j + 1));
				}
			}

			if (Af.get(0).equals(Bf.get(1)) || Af.get(1).equals(Bf.get(0))) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}

		}

		input.close();
	}

}
