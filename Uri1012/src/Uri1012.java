//biblioteca de leitura 
//classe de scaner 
import java.util.Scanner;


public class Uri1012 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double pi = 3.14159;
		
		
		System.out.println("Digite um valor real ");
		a = teclado.nextFloat();
		//teclado.nextDouble confere se � num float
		
		
		System.out.println("Digite um valor real ");
		b = teclado.nextFloat();
		//teclado.nextDouble confere se � num float
		
		System.out.println("Digite um valor real ");
		c = teclado.nextFloat();
		//teclado.nextDouble confere se � num float
		
			
		System.out.printf("a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura vale %.3f\n", ((a*c)/2));
		
		System.out.printf(" a �rea do c�rculo de raio C. (pi = 3.14159) %.3f\n", (pi*c*c) );
		
		System.out.printf(" a �rea do trap�zio que tem A e B por bases e C por altura.) %.3f\n", ((a+b)*c)/2f );
		
		System.out.printf(" a �rea do quadrado que tem lado B.) %.3f\n",b*b);
		
		System.out.printf("a �rea do ret�ngulo que tem lados A e B.)%.3f\n", a*b);
		
		
		teclado.close();//teclado para de executar sua fun��o pois n�o � mais neces�rio
		
	}
	
	
}