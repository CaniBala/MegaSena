package megasena;

public class verificaAposta {

	//O Static e usado quando a variavel vai ser global para todos os objetos que forem
	//utilizar aquela classe
	
	
	private static int acertoMega = 0, acertoQuina = 0, acertoQuadra = 0,
			acertoTres = 0, acertoDois = 0, acertoUm = 0, jogosJogados = 1;
	private double valorJogo = 3.5;
	private static double valorTotalJogado;

	public static int getAcertoMega() {
		return acertoMega;
	}

	public static int getAcertoQuina() {
		return acertoQuina;
	}

	public static int getAcertoQuadra() {
		return acertoQuadra;
	}

	public static int getAcertoTres() {
		return acertoTres;
	}

	public static int getAcertoDois() {
		return acertoDois;
	}

	public static int getAcertoUm() {
		return acertoUm;
	}

	public static int getJogosJogados() {
		return jogosJogados;
	}

	public double getValorJogo() {
		return valorJogo;
	}

	public void setValorJogo(double valorJogo) {
		this.valorJogo = valorJogo;
	}

	public static double getValorTotalJogado() {
		return valorTotalJogado;
	}

	public void verificaAcertos(int[] numJogador, int[] numMega) {

		// da para acessar por fora?
		int acerto = 0;

		for (int x = 0; x < 6; x++) {

			for (int y = 0; y < 6; y++) {
				if (numMega[x] == numJogador[y]) {
					acerto++;
				}
			}
		}

		if (acerto == 6) {
			verificaAposta.acertoMega++;
		}
		if (acerto == 5) {
			verificaAposta.acertoQuina++;
		}
		if (acerto == 4) {
			verificaAposta.acertoQuadra++;
		}
		if (acerto == 3) {
			verificaAposta.acertoTres++;
		}
		if (acerto == 2) {
			verificaAposta.acertoDois++;
		}
		if (acerto == 1) {
			verificaAposta.acertoUm++;
		}

		valorTotalJogado = valorTotalJogado + valorJogo;
		jogosJogados++;

	}

}
