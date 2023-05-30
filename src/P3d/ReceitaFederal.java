package P3d; //---------------------------------------------------------------- FIGURA 08

public class ReceitaFederal {

	public static void main(String[] args) {
		Contribuinte julia = new Contribuinte ( "Julia");
		Dependente jorge = new Dependente ( "Jorge");
		Dependente sandra = new Dependente ( "Sandra");
		julia.ligarDependente(jorge);
		julia.ligarDependente(sandra);
		julia.imprimir();
		System.out.println("Numero de dependentes : " + julia.numeroDependentes ( ) + "\n");
		
		Contribuinte leonardo = new Contribuinte ("Leonardo");
		Dependente marta = new Dependente ("Marta");
		Dependente diego = new Dependente ("Diego");
		Dependente claudia = new Dependente ("Claudia");
		leonardo.ligarDependente(marta);
		leonardo.ligarDependente(diego);
		leonardo.ligarDependente(claudia);
		leonardo.imprimir();
		System.out.println ("Numero de dependentes: " + leonardo.numeroDependentes ( ) + "\n");

        // Altere a classe ReceitaFederal:
        // Acrescente um novo contribuinte Pedro, sem dependente. Imprima o total de dependentes de Pedro (zero dependentes).
        // Acrescente um novo contribuinte João, com uma única dependente Ana. Imprima o total de dependentes de Pedro (uma dependente).

        Contribuinte pedro = new Contribuinte ("Pedro");
		pedro.imprimir();
		System.out.println ("Numero de dependentes: " + pedro.numeroDependentes ( ) + "\n");

        Contribuinte joao = new Contribuinte ("João");
		Dependente ana = new Dependente ("Ana");
		joao.ligarDependente(ana);
		joao.imprimir();
		System.out.println ("Numero de dependentes: " + joao.numeroDependentes ( ) + "\n");

	}
}
