import java.util.Scanner;

public class quatro3 {

	public static void preencher(int[] vetA)
	{
		Scanner entrada = new Scanner(System.in);
		
		for(int ln =0; ln < vetA.length; ln++)
		{
			
			System.out.print("Preecha o vetor linha["+ ln +"]: ");
			vetA[ln] = entrada.nextInt();
			
		}
		
	
	}
	
	public static int conferir(int [] igual, int num) {
		
		int cont = 0;
		
		for(int i = 0; i < igual.length; i++) 
		{
		
			if(igual[i] == num)
			{
				cont++;
			}
			
		}
		
		return (cont);
		
	}
	// vendo quais quantas vezes o valor repitiu e informando o usuario quantas vezes foi
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] a = new int[10];
		int var;
		
		preencher(a);
		
		System.out.print("Qual numero vc quer ver se repitiu? ");
		var = entrada.nextInt();
		
		System.out.print("Tem " +conferir(a, var)+" numeros "+ var);
		
		entrada.close();

	}

}
