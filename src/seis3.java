import java.util.Scanner;

public class seis3 {

	public static void preenche(int[] vetX)
	{
		Scanner entrada = new Scanner(System.in);
		
		for(int ln =0; ln < vetX.length; ln++)
		{
			
			System.out.print("Digite valores: "+ ln +": ");
			vetX[ln] = entrada.nextInt();
			
		}
		
	
	}
	// vendo quais sao numeros negativos imprimindo o vetor dos negativos e mostrando quantos tinha no vetor
	public static int funcao(int[] vetorZ )
	{
		int cont =0;
		int [] vetneg = new int[10];
		
		
		
		for(int ln =0; ln < vetorZ.length; ln++)
		{
			
			if(vetorZ[ln] < 0) {
				
				vetneg[cont] = vetorZ[ln]; 
				
				System.out.print( vetneg[cont] + " ");
					
				cont++;
					
			}
			
		}
		System.out.println();
		return (cont);
		
	}
	public static void main(String[] args) {
		
			int[] x = new int[10];
			
			
			preenche(x);
			
			System.out.println("O numero de valores negativos foi: "+ funcao(x));

	}

}
