package p2cg;

public class Jogo {
	private Jogo jogo;
	private String nome;
	private double preco;
	private int maiorScore;
	private int qntdJogadas;
	private boolean zerou;
	private int score;
	private String tipo;
	
	
	//Criacao do objeto
	public Jogo(String nome, double preco, int maiorScore, int qntdJogadas, boolean zerou, int score, String tipo) {
		this.jogo = new Jogo(nome, preco, maiorScore, qntdJogadas, zerou, score, tipo);
		this.maiorScore = maiorScore;
		this.qntdJogadas = qntdJogadas;
		this.zerou = zerou;
	}
	
	


	public void registraJogada(int score, boolean zerou){
		this.zerou = zerou;
		this.score = score;
		if (this.score > maiorScore){
			maiorScore = this.score;
		}
		
		
	}
	
	
	
	
	
	// gets e sets
	public int getMaiorScore() {
		return maiorScore;
	}

	public void setMaiorScore(int maiorScore) {
		this.maiorScore = maiorScore;
	}

	public int getQntdJogadas() {
		return qntdJogadas;
	}

	public void setQntdJogadas(int qntdJogadas) {
		this.qntdJogadas = qntdJogadas;
	}

	public boolean isZerou() {
		return zerou;
	}

	public void setZerou(boolean zerou) {
		this.zerou = zerou;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
	
	public String getTipo() {
		return tipo;
	}


	
	

}
