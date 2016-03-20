package megasena;

public class megasenaLauncher {

	public static void main(String[] args) {

		int numMega[], numJogador[], numJogos = 100000;

		// inicio calculo tempo de execucao
		long tempoInicial = System.currentTimeMillis();

		numMega = new int[6];
		numJogador = new int[6];

		// declaração combinada
		// int numMega[] = new int[6];

		//instanciando os objetos
		sorteio sorteio1 = new sorteio();
		usuarioAposta aposta1 = new usuarioAposta();
		verificaAposta verifica1 = new verificaAposta();

		System.out.println("Digite 6 numeros para apostar");

		numJogador = aposta1.fazerAposta();
		
		//for (int z = 0; z < numJogos; z++){
		while (verificaAposta.getAcertoQuina() != 1) {

			numMega = sorteio1.sorteioMega();

			
			System.out.println("+-----------------------------------------------+");
			System.out.print("| ");
			for (int x = 0; x < 6; x++) {
				System.out.print(numMega[x] + " ");
			}


			System.out.print("  -  Jogo numero: "+verificaAposta.getJogosJogados());
			
			System.out.println(" |");
			
			verifica1.verificaAcertos(numJogador, numMega);
		}

		imprimir.imprimeResultadoFinal();

		long tempoFinal = System.currentTimeMillis();
		System.out.printf("%.3f Segundos%n",
				(tempoFinal - tempoInicial) / 1000d);
	}

}
