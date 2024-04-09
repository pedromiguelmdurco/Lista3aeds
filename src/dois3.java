
import java.util.Scanner;

public class dois3 {

	public static int divisao(int divisor, int divide)
	{
		
		if(divisor < divide)
		{
			
			return (0);
			
		}
		
		else 
		{
			
			return(1+divisao(divisor - divide,divide));
			
		}
		
	}
	
	public static int rest (int diviso, int divid)
	{
		if (diviso < divid)
		{
			
			return (diviso);
			
		}
		
		else
		{
			
			return (rest(diviso-divid, divid));
			
		}
	}
	// fazendo a divisao e mostrando o resto como pedido
	public static void main(String[] args) {
		Scanner entrada = new  Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("Digite um numero: ");
		num1 = entrada.nextInt();
		
		System.out.print("Digite outro numero: ");
		num2 = entrada.nextInt();
		
		System.out.println("O resultado foi: "+ divisao(num1,num2));
		
		System.out.println("O que sobrou foi: "+ rest(num1,num2));
		
		entrada.close();
	}

}