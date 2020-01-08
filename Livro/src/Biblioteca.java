import java.util.Scanner;

public class Biblioteca {
	public static void main (String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Livro l1;	// declarei que t1 vai manipular uma TV
		Livro l2;
		Livro l3;
		Livro l4;
		Livro l5;
		
		l1 = new Livro("a cabana", "erick puto","terro", 2000, 2 ,3, false); // reservo um espoaço na memória pra isso 
		l2 = new Livro("a casinha", "erick putinho","terrozinho", 2010, 1 ,5, true);
		l3 = new Livro("a teoria de tudo ", "stephen halkinkg","fisica", 1999, 1 ,2, false);
		l4 = new Livro("o mundo", "Edward witts","aventura", 2020, 4 ,2, false);
		l5 = new Livro("a coisa", "coisao","coisa de coisa", 1999, 1 ,1, true);
		
	}
		
		
		
		
		
}

