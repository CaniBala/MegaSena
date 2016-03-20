package megasena;

import java.util.Random;

public class sorteio {

	private int numSorteado[] = new int[6];

	public int[] sorteioMega() {

		for (int x = 0; x < 6; x++) {

			Random gerador = new Random();
			numSorteado[x] = gerador.nextInt(59) + 1;

			for (int y = 0; y < 6; y++) {
				if ((x != 0) && (numSorteado[x] == numSorteado[y]) && (y < x)) {
					numSorteado[x] = gerador.nextInt(59) + 1;
				}
			}

		}
		return numSorteado;
	}
}