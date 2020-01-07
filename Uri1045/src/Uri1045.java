import java.util.Scanner;

public class Uri1045 {
	public static void main(String [] args) {
		Scanner teclado;
		teclado = new Scanner (System.in);
		//area de declaração de variaveis
		double a , b , c ;
		double aux, a2 , bc;
		Scanner sc = new Scanner(System.in);
		//Area para entrada de dados
		
		a = sc.nextDouble();
		
		b = sc.nextDouble();
		
		c = sc.nextDouble();
		//verificar se (a) é o maior dos elementos
		if (b > a) {
			aux = a ;
			a   = b ;
			b   = aux ;
		}
		if(c > a) {
			aux = a ;
			a   = c;
			c   = aux;
		}
		a2 = a * a;
		bc = b * b+ c * c ;
		
		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			//pode formar algum triângulo
			if (a2 > bc) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}else if (a2 < bc) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			else {
				System.out.println("TRIANGULO RETANGULO");
			}
			//Verificar as arestas
			if(a == b && b == c ) {
				System.out.println("TRIANGULO EQUILATERO");	
			}else if(a == b || a == c || b == c ) {
				System.out.println("TRIANGULO ISOSCELES");	
			}
		}
		sc.close();
		
	}
}
