import java.util.Scanner;

public class um3 {

	public static int divisao(int divisor, int divide)
	{
		
		if(divisor < divide)
		{
			return (0);
		}
		else {
			return(1+divisao(divisor - divide,divide));
		}
		
	}
	// fazendo a divisao sem utilar % 
	public static void main(String[] args) {
		Scanner entrada = new  Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("Digite um numero: ");
		num1 = entrada.nextInt();
		
		System.out.print("Digite outro numero: ");
		num2 = entrada.nextInt();
		
		System.out.println("O resultado foi: "+ divisao(num1,num2));
		
		entrada.close();
	}

}