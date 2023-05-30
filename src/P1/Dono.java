package P1; //---------------------------------------------------------------- FIGURA 02

public class Dono {
	private String nome;
	private Cao    pet;  // Dono está associado com seu Cão
	
	public Dono(String nome) {
		this.nome = nome;
	}
	public void setPet (Cao pet) {
		this.pet = pet;
	}
	public Cao getPet () {
		return this.pet;
	}
	public void alimentarCao() {
		pet.realizarRefeicao();
	}
	public void receberFesta() {
		System.out.println(this.nome + " está recebendo festa de " + 
            this.pet.getNomeCao());
	}

	public static void main(String[] args) {
		Dono  maria  = new Dono ("Maria");
		Cao   pipoca = new Cao  ("Pipoca", "Beagle", "Fêmea", 3, "Enrolada", "Pêlo curtinho");
		maria.setPet        (pipoca); // associa Maria com Pipoca
		pipoca.setMeuDono   (maria);  // associa Pipoca com Maria
				
		System.out.println("Cãozinho de " + maria.nome);
		maria.getPet().printCao();
		
		maria.alimentarCao();  // Maria alimenta o seu cão Pipoca
		pipoca.agradarDono();  // Pipoca agrada sua dona Maria	
	}
}
