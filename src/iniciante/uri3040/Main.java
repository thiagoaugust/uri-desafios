package iniciante.uri3040;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		
		for (int i = 0; i < a; i++) {
			int altura = input.nextInt();
			int espessura = input.nextInt();
			int galhos = input.nextInt();
			boolean isAlturaOk = altura >=200 && altura <= 300;
			if(galhos >= 150 && espessura >= 50 && isAlturaOk) {
				System.out.println("Sim");
			}else {
				System.out.println("Nao");
			}
		}

		input.close();
	}

	


}
