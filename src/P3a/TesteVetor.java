package P3a; //---------------------------------------------------------------- FIGURA 04
public class TesteVetor{
    public static void main(String[] args) {

        int[] meuVetor = new int [5]; 
    
        meuVetor[0] = 33;
        meuVetor[1] = 47;
        meuVetor[2] = 78;
        meuVetor[3] = 5;
        meuVetor[4] = 18;
            
        for(int i=0; i< meuVetor.length; i++)
            System.out.println("meuVetor[" + i + "] = " + meuVetor[i]);
        // meuVetor.length = comprimento do vetor = 5 inteiros mantidos no vetor        
    }
}