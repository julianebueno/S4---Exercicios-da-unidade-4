package P1; //---------------------------------------------------------------- FIGURA 02


public class Cao {             // Associação: meuDono é uma referência da 
	private Dono   meuDono;  // classe Dono e também atributo da classe Cão
	private String nomeCao;   
	private String raca;
	private String genero;
	private int    idade;
	private Cauda  minhaCauda; // Composição: Cão possui Cauda

	public Cao(String nome, String raca, String genero, int idade, String forma, String tipoPelo) {
		this.nomeCao = nome;
		this.raca = raca;
		this.genero = genero;
		this.idade = idade;     // Composição: a cauda faz parte do cão
		this.minhaCauda = new Cauda (forma, tipoPelo); 
	}                          
	public void setMeuDono(Dono meuDono) {
		this.meuDono = meuDono;
	}
	public String getNomeCao() {
		return nomeCao;
	}
	public void printCao() {
		System.out.println("  Nome:   " + this.nomeCao);
		System.out.println("  Raça:   " + this.raca);
		System.out.println("  Gênero: " + this.genero);
		System.out.println("  Idade:  " + this.idade);
		minhaCauda.printCauda();
		System.out.println();
	}
	public void realizarRefeicao() {
		System.out.println(this.nomeCao + " fazendo sua refeição.");
	}
	public void agradarDono() {
		this.meuDono.receberFesta(); // Invoca método da classe Dono
	}
}