import java.util.Scanner;

public class Prova {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int acertos = 0;
		
		Quest�oSimples simulado [] = new Quest�oSimples[6];
		simulado[0] = new Quest�oSimples("porque a galinha atravassou a rua ?","pra chegar do outro lado");
		simulado[1] = new quest�oMultiplaEscolha("quanto mundiais o palmeiras tem ?","0","2","3","0","5");
		simulado[2] = new Quest�oSimples("porque a galinha atravassou a rua ?","pra chegar do outro lado");
		simulado[3] = new quest�oMultiplaEscolha("quanto mundiais o palmeiras tem ?","0","2","3","0","5");
		simulado[4] = new Quest�oSimples("porque a galinha atravassou a rua ?","pra chegar do outro lado");
		simulado[5] = new quest�oMultiplaEscolha("quanto mundiais o palmeiras tem ?","0","2","3","0","5");
		
		
		
		for (int i=0;i<simulado.length;i++) {
			System.out.println(simulado[i].aplicarQuestao());  
			String respostauser = input.nextLine();                 
			if (simulado[i].corrigir(respostauser)) {          
				acertos++;
			}
		}
		System.out.println("Voce teve "+acertos+" acertos");
			

	}
}
