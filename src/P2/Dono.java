package P2; //---------------------------------------------------------------- FIGURA 02

public class Dono {
	private String nome;
	private Cao    pet;  // Dono está associado com seu Cão
	private Cao pet2;
	
	public Dono(String nome) {
		this.nome = nome;
	}
	public void setPet (Cao pet) {
		this.pet = pet;
	}
	public Cao getPet () {
		return this.pet;
	}
	public void setPet2 (Cao pet) {
		this.pet2 = pet;
	}
	public Cao getPet2 () {
		return this.pet2;
	}
	public void alimentarCao() {
		pet.realizarRefeicao();
		pet2.realizarRefeicao();
	}
	public void receberFesta() {
		System.out.println(this.nome + " está recebendo festa de " + this.pet.getNomeCao());
		System.out.println(this.nome + " está recebendo festa de " + this.pet2.getNomeCao());
	}

	public static void main(String[] args) {
		Dono  maria  = new Dono ("Maria");
		Cao   pipoca = new Cao  ("Pipoca", "Beagle", "Fêmea", 3, "Enrolada", "Pêlo curtinho");
		Cao bruce = new Cao ("Bruce", "Pug", "Macho", 2, "Caracol", "Pelo curtinho");

		maria.setPet        (pipoca); // associa Maria com Pipoca
		maria.setPet2       (bruce); // associa Maria com Pipoca
		pipoca.setMeuDono   (maria);  // associa Pipoca com Maria
		bruce.setMeuDono    (maria);  // associa Pipoca com Maria
				

		System.out.println("Cãozinho de " + maria.nome);
		maria.getPet().printCao();
		maria.getPet2().printCao();
		
		maria.alimentarCao();  // Maria alimenta o seu cão Pipoca
		pipoca.agradarDono();  // Pipoca agrada sua dona Maria	
		bruce.agradarDono();  // Pipoca agrada sua dona Maria	
	}
}
