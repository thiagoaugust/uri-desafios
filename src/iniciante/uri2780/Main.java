package iniciante.uri2780;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		int distancia = input.nextInt();
		boolean isOnPoint = distancia<=800;
		boolean isTwoPoint = distancia>800 && distancia <=1400;
		
		if(isOnPoint) {
			System.out.println(1);
		}else if(isTwoPoint) {
			System.out.println(2);
		}else {
			System.out.println(3);
		}
		
		input.close();
	}

}