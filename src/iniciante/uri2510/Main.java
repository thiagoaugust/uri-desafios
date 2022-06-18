package iniciante.uri2510;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		int repete = input.nextInt();
		
		for (int i = 0; i < repete; i++) {
			String bandido = input.next();
			if(bandido.equalsIgnoreCase("Coderinga")) {
				System.out.println("N");
			}else {
				System.out.println("Y");
			}
		}
		
		input.close();
	}

}

