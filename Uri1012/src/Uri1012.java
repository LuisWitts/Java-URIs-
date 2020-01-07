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
		//teclado.nextDouble confere se é num float
		
		
		System.out.println("Digite um valor real ");
		b = teclado.nextFloat();
		//teclado.nextDouble confere se é num float
		
		System.out.println("Digite um valor real ");
		c = teclado.nextFloat();
		//teclado.nextDouble confere se é num float
		
			
		System.out.printf("a área do triângulo retângulo que tem A por base e C por altura vale %.3f\n", ((a*c)/2));
		
		System.out.printf(" a área do círculo de raio C. (pi = 3.14159) %.3f\n", (pi*c*c) );
		
		System.out.printf(" a área do trapézio que tem A e B por bases e C por altura.) %.3f\n", ((a+b)*c)/2f );
		
		System.out.printf(" a área do quadrado que tem lado B.) %.3f\n",b*b);
		
		System.out.printf("a área do retângulo que tem lados A e B.)%.3f\n", a*b);
		
		
		teclado.close();//teclado para de executar sua função pois não é mais necesário
		
	}
	
	
}