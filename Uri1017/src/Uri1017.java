import java.util.Scanner;
public class Uri1017 {

	public static void main (String args[]){
		
	
			Scanner teclado;
			teclado = new Scanner(System.in);
			
			int horas = teclado.nextInt();
			int kmphm = teclado.nextInt();
			
			double qtdlitros = (horas *kmphm)/12f;
			
			
			System.out.printf("%.3f",qtdlitros);
			teclado.close();
	}
}
