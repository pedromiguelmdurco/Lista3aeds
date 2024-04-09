import java.util.Scanner;

public class dez3 {

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
	
	public static void a(int[][] aa)
	{
		int [][]troc = new int[10][10];
		
		
		
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				
				if(ln == 1) {
					troc[2][cl] = aa[ln][cl];
				}
				else if(ln == 7) 
				{
					troc[1][cl] = aa[ln][cl];
				}
				
				
			}
				
		}
		
		
		
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				
				aa[7][cl] = troc[1][cl];
				aa[1][cl] = troc[2][cl];
				
				System.out.print(aa[ln][cl]+ " ");
				
			}
				System.out.println();
		}
		
	}
	// aq eu usei uma matriz para armarzenar os valores e depois trasnferir na A tb
	public static void b(int [][]aa)
	{
		
		int [][]troc = new int[10][10];
		
		
		
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				
				if(cl == 3) {
					troc[ln][0] = aa[ln][cl];
				}
				else if(cl == 9) 
				{
					troc[ln][1] = aa[ln][cl];
				}
				
				
			}
				
		}
		
		
		
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				
				aa[ln][3] = troc[ln][0];
				aa[ln][9] = troc[ln][1];
				
				System.out.print(aa[ln][cl]+ " ");
				
			}
				System.out.println();
		}
		
		
	}
	// não consegui fazer a c
	/*public static void c(int[][] aa) {
		
		int col = 0;
		int [][] result = new int[3][3];
		
		
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				result[0][0] = aa[ln][cl];
			}
			
		}
		
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				result[1][1] = aa[cl][ln];
			}
			
		}
		
		
		
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				if(ln == cl) {
					
					aa[ln][cl] = result[1][1];
				
				}
				
				//aa[ln][cl] = result[0][0];
				
				System.out.print(aa[ln][cl]+ " ");
				
			}
				System.out.println();
		}
		
	}*/
	// a letra d é impossivel pois quando vc vai ver os valores n se batem
	public static void d(int[][]aa)
	{
		int [][]troc = new int[3][3];
		
		
		
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				
				if(ln == 1) {
					troc[2][cl] = aa[ln][cl];
				}
				else if(cl == 0) 
				{
					troc[ln][1] = aa[ln][cl];
				}
				
				
			}
				
		}
		
		
		
		for(int ln = 0; ln < aa.length; ln++)
		{
				
			for(int cl = 0; cl < aa[ln].length; cl++)
			{
				
				aa[ln][1] = troc[ln][1];
				aa[2][cl] = troc[2][cl];
				
				System.out.print(aa[ln][cl]+ " ");
				
			}
				System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [][] a = new int[10][10];
		
		preenche(a);
		
		for(int ln = 0; ln < a.length; ln++)
		{
				
			for(int cl = 0; cl < a[ln].length; cl++)
			{
				
				System.out.print(a[ln][cl]+ " ");
				
			}
				System.out.println();
		}
		
		System.out.println("A)");
		a(a);
		
		System.out.println("B)");
		b(a);

		System.out.println("D)");
		d(a);
		
		entrada.close();

	}

}
