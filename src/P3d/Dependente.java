package P3d; //---------------------------------------------------------------- FIGURA 08

public class Dependente {
	private String nome;
	
	public Dependente(String nome) {
		this.nome = nome;
	}
	public void imprimir() {
		System.out.println ("Dependente: " + nome);
	}
}