package p2cg;
// NÃO É PARA TER LOJA...
public class P2_GC {
	private Jogo jogo;
	private String nome;
	private double preco;
	private int maiorScore;
	private int qntdJogadas;
	private boolean zerou;
	private int score;
	private String nomeUsuario;
	private String login;
	private double carteira;

	
	
	
	public void Jogo(String nome, double preco, int maiorScore, int qntdJogadas, boolean zerou, String jogabilidade){
		this.maiorScore = maiorScore;
		this.qntdJogadas = qntdJogadas;
		this.zerou = zerou;
	}


	public void registraJogada(int score, boolean zerou) {
	//	return int x2p;
		if (this.score > maiorScore){
			maiorScore = this.score;
		}

	}
	
	public void Usuario(String nomeUsuario, String login, double carteira){
		
	}

	
	
}
