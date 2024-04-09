import java.util.Scanner;

public class oito3 {

	public static void preenche(int[][] mat) {
		
		Scanner entrada = new Scanner (System.in);
		
		for(int ln = 0; ln < mat.length; ln++)
		{
			
			for(int cl = 0; cl < mat[ln].length; cl++)
			{
				System.out.print("Digite o valor ["+ ln+"]["+cl+"]: ");
				mat[ln][cl] = entrada.nextInt();
			}
			
		}
	
		entrada.close();
		
	}
	// aq eu somei as variaveis
	public static int a(int[][] matriz)
	{
		int result = 0;
		
		
			
			for(int cl = 0; cl < matriz[3].length; cl++)
			{
				result += matriz[3][cl];
			}
			
		
		return (result);
	}
	// aq eu somei as colunas na variavel result
	public static int b(int[][] matriz)
	{
		int result = 0;
		
		
			
			for(int ln = 0; ln < matriz[1].length; ln++)
			{
				result += matriz[ln][1];
			}
			
		
		return (result);
	}
	// aq eu conferir se era iguais a coluna e a linha pq assim eu conseguia ver se elas estavam na diagonal
	public static int c(int[][] matriz)
	{
		int result = 0,cl =0;
		
		
		for(int ln = 0; ln < matriz.length; ln++)
		{
			
			if(ln == cl) {
				
				result+= matriz[ln][cl];
				cl++;
			}
				
		}
			
		
		return (result);
	}
	// aq eu peguei o maior valor e fui diminuindo
	public static int d(int[][] matriz)
	{
		int result = 0, cl =0;
		
		
		for(int ln = (matriz.length - 1); ln > -1; ln--)
		{
			
			result += matriz[ln][cl];
			
			cl++;
				
		}
			
		
		return (result);
	}
	//somei tudo
	public static int e(int[][] matriz)
	{
		int result =0;
		
		for(int ln = 0; ln < matriz.length; ln++)
		{
		
			for(int cl = 0; cl < matriz[ln].length; cl++)
			{
			
				result += matriz[ln][cl];
				
			}
		
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int [][] matriz = new int[5][5];
		
		preenche(matriz);
		
		System.out.println("a)"+a(matriz));
		System.out.println("b)"+b(matriz));
		System.out.println("c)"+c(matriz));
		System.out.println("d)"+d(matriz));
		System.out.println("e)"+e(matriz));

	}

}
