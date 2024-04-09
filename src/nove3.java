import java.util.Scanner;

public class nove3 {

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
		
		System.out.println();
	}
	// aq eu somei as matrizes
	public static int[][] a(int[][]aa, int [][]bb)
	{
		int[][] s = new int[2][2];
	
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				s[ln][cl] = aa[ln][cl];
			}
				
		}
		
		for(int ln = 0; ln < bb.length; ln++)
		{
				
			for(int cl = 0; cl < bb[ln].length; cl++)
			{
				s[ln][cl] += bb[ln][cl];
			}
				
		}
		
		return (s);
	}
	//  aq eu subtrai as matrizes
	public static int[][] b(int[][]aa, int [][]bb)
	{
		int[][] s = new int[4][6];
	
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				s[ln][cl] = aa[ln][cl];
			}
				
		}
		
		for(int ln = 0; ln < bb.length; ln++)
		{
				
			for(int cl = 0; cl < bb[ln].length; cl++)
			{
				s[ln][cl] -= bb[ln][cl];
			}
				
		}
		
		return (s);
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [][] a = new int[4][6];
		int [][] b = new int[4][6];
		
		
		preenche(a);
		preenche(b);
		
		// aq eu imprimi as matrizes
		System.out.println("A soma foi de: ");
		for(int ln = 0; ln < a(a,b).length; ln++)
		{
				
			for(int cl = 0; cl < a(a,b)[ln].length; cl++)
			{
				
				System.out.print(a(a,b)[ln][cl]+ " ");
				
			}
				System.out.println();
		}
		
		System.out.println("A diferença foi de: ");
		for(int ln = 0; ln < b(a,b).length; ln++)
		{
				
			for(int cl = 0; cl < b(a,b)[ln].length; cl++)
			{
				
				System.out.print( b(a,b)[ln][cl]+ " ");
				
			}
				System.out.println();
		}
		
		
		
		entrada.close();

	}

}
