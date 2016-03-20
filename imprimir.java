package megasena;

public class imprimir {
	
	public static void imprimeResultadoFinal() {
	
	System.out.println("Numero de acertos Sena: " + verificaAposta.getAcertoMega());
	System.out.println("Numero de acertos Quina: " + verificaAposta.getAcertoQuina());
	System.out.println("Numero de acertos Quadra: " + verificaAposta.getAcertoQuadra());
	System.out.println("Numero de acertos 3: " + verificaAposta.getAcertoTres());
	System.out.println("Numero de acertos 2: " + verificaAposta.getAcertoDois());
	System.out.println("Numero de acertos 1: " + verificaAposta.getAcertoUm());
	System.out.println("Jogos jogados: " + verificaAposta.getJogosJogados());
	System.out.println("Voce gastou R$: " + verificaAposta.getValorTotalJogado() + " em jogos");
	
	}


	
}
