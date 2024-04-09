import java.util.Scanner;

public class tres3 {

	public static double ValorS(double base)

	{
		if(base == 0 || base == 1)
		{
			
			return 1 ;
			
		}
		else
		{
			
			return (1/(base* ValorS(base-1)));
			
		}
	}

// fazendo uma funçao recursiva para ver o fatorial e logo a baixo armazenando os valores e depois somando
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	double N;
	double a=0;
	
	System.out.println("Digite o valor de N: ");
	N = entrada.nextInt();
	
	while(0< N) {
		a += ValorS(N);
		N--;
	}
	System.out.println(a-1);


	entrada.close();

	}

}
