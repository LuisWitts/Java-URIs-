//biblioteca de leitura 
//classe de scaner 
import java.util.Scanner;


public class ExemlpoLeitura {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int a ;
		float b;
		String texto;
		
		System.out.println("Digite um nome: ");
		texto = teclado.nextLine();
		//teclado.NextLine confere se � string 
		
		
		System.out.println("Digite um valor inteiro ");
		a = teclado.nextInt();
		//teclado.NextInt confere se � num int
		
		
		System.out.println("Digite um valor real ");
		b = teclado.nextFloat();
		//teclado.NextFloat confere se � num float
		
		
		System.out.println("Voce digitou o nome"+ texto);
		System.out.println("Voce digitou os valores "+a+" e "+b);
		
		teclado.close();//teclado para de executar sua fun��o pois n�o � mais neces�rio
		
	}
	
	
}
