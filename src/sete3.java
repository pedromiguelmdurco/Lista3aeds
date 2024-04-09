import java.util.Scanner;

public class sete3 {

	
	public static void preenche(int[] par)
	{
		Scanner entrada = new Scanner(System.in);
		
		for(int ln =0; ln < par.length; ln++)
		{
			
			System.out.print("Preencha o vetor: ");
			par[ln] = entrada.nextInt();
			
		}
		
		System.out.println();
	}
	
	
	
	public static void conferir(int[] veto1, int[] veto2)
	{
		int contp = 0, conti = 0;
		int [] par = new int[20];
		int [] impar = new int[20];
		// olhando vetor por vetor vendo quais numeros sao pares
		for(int ln =0; ln < veto1.length; ln++)
		{
			
			if (veto1[ln] % 2 == 0) {
				  
				   par[contp] = veto1[ln];
				   
				   contp++;
				  
				} else {

				   impar[conti] = veto1[ln];
				   conti++;
				}
			
		}
		
		
		
		for(int ln2 =0; ln2 < veto2.length; ln2++)
		{
			
			if (veto2[ln2] % 2 == 0) {
				  
				   par[contp] = veto2[ln2];
				   
				   contp++;
				  
			} else 
			{

			   impar[conti] = veto2[ln2];
			   conti++;
			}
			
		}
	
		System.out.println("Pares");
		
		for(int ln =0; ln < par.length; ln++)
		{
			if(par[ln] != 0)
			{
				
				System.out.print(par[ln]+ " ");
			
			}
			
		}
		
		System.out.println();
		System.out.println("Impares");
		// para imprimir o vetor sem que aja 0
		for(int ln =0; ln < impar.length; ln++)
		{
			if(impar[ln] != 0)
			{
				
				System.out.print(impar[ln]+ " ");
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		
		preenche(vet1);
		preenche(vet2);
		
		conferir(vet1,vet2);
		
		entrada.close();

	}

}
