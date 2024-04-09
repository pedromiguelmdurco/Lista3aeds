import java.util.Scanner;

public class cinco5 {

	public static void preencher(int[] vetA)
	{
		Scanner entrada = new Scanner(System.in);
		
		for(int ln =0; ln < vetA.length; ln++)
		{
			
			System.out.print("Preecha com a nota do aluno "+ ln +": ");
			vetA[ln] = entrada.nextInt();
			
		}
		
	
	}
	// pegando notas dos alunas fazendo a media depois coferindo se estao ou n acima da media
	public static void media(int[] vetB)
	{
		
		int med = 0, cont =0;
		
		for(int ln =0; ln < vetB.length; ln++)
		{
			
			med += vetB[ln];
			
		}
		
		med /= vetB.length ;
		
		for(int ln =0; ln < vetB.length; ln++)
		{
			
			if(vetB[ln] >= med) 
			{
				cont++;
			}
			
		}
		
		System.out.println("A media dos alunos foi: "+ med);
		System.out.println("Numero de alunos que ficaram acima da media: "+ cont);
	}
	
	public static void main(String[] args) {
		
		int [] a = new int[10];
		
		preencher(a);
		
		media(a);

	}

}
