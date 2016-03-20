package megasena;

import java.util.Scanner;

public class usuarioAposta {

	private int apostaUsuario[] = new int[6];

	public int[] fazerAposta() {

		for (int x = 0; x < 6; x++) {

			Scanner entrada = new Scanner(System.in);
			apostaUsuario[x] = entrada.nextInt();
		}
		return apostaUsuario;
	}

}
