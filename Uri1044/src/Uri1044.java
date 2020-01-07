
import java.util.Scanner;


public class Uri1044 {
	public static void main(String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int b = teclado.nextInt();
		int a = teclado.nextInt();
		int temp;
		
		if(a < b ) {
			temp = a;
			a = b ;
			b = temp;
		}
			
		if(a % b == 0 ) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		teclado.close();
	}
	
	
	
}