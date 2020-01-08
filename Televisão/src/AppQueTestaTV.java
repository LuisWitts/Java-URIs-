import java.util.Scanner;

public class AppQueTestaTV {

	public static void main (String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Televisao t1; // declarei que t1 vai manipular uma TV
		t1 = new Televisao("sony", 110, 32); // reservo um espoaço na memória pra isso 
		
		t1.setMarca("Sony");
		t1.setVoltagem(110);
		t1.setTamanho(35);
		t1.setLigada(false);
		t1.setCanal(5);
		t1.setVolume(99);
		
		
		do {
			System.out.println("*********************************");
			System.out.println("          controle Remoto        ");
			System.out.println("---------------------------------");
			System.out.println(" 1 - Ligar/Desligar              ");
			System.out.println(" 2 - Aumentar Volume             ");
			System.out.println(" 3 - Diminuir Volume             ");
			System.out.println(" 4 - avancar canal               ");
			System.out.println(" 5 - voltar canal                ");
			System.out.println(" 0 - Encerrar Sistema            ");
			System.out.println("*********************************");
			opcao = teclado.nextInt();
			//logica das opcoes
			
			switch(opcao) {
			case 1 :
				t1.switchPower();
				break;
			}
			switch(opcao) {
			case 2 :
				t1.aumentarVolume();
				break;
			}
			switch(opcao) {
			case 3 :
				t1.diminuirVolume();
				break;
			}
			switch(opcao) {
			case 4 :
				t1.avancarcanal();
				break;
			}
			switch(opcao) {
			case 5 :
				t1.voltarcanal();
				break;
			}
			
			System.out.println("\n\n\n\n\n\n");
			
			
		}while (opcao != 0);
		
	}
}
