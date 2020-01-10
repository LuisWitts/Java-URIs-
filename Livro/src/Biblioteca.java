import java.util.Scanner;

public class Biblioteca {
	public static void main (String args[]) {
		
		Livro l1, l2;
		
		
		
		l1 = new Livro("Java dev", "thiago e isidro","terror", 2000, 2 ,3); // reservo um espoaço na memória pra isso 
		l2 = new Livro("a casinha", "erick putinho","terrozinho", 2010, 1 ,5);
		
		l1.exibirInfo();
		l2.exibirInfo();
		
		l1.devolver();
		l1.exibirInfo();
		l2.exibirInfo();
		
		
	}
		
		
		
		
		
}

