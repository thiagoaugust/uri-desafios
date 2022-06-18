package iniciante.uri2172;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int x = -1;
		BigInteger m = new BigInteger("-1");

		while (true) {
			x = input.nextInt();
			m = input.nextBigInteger();
			if(x == 0 && m.equals(BigInteger.ZERO)) {
				break;
			}
			BigInteger bigNumber = m.multiply(BigInteger.valueOf(x));
			System.out.println(bigNumber);
		}

		input.close();
	}

}
