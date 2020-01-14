import java .util.Scanner;

public class cadastrar {
	public static void main (String args[]) {
		Produto lista[] = new Produto[5];
		int i;
		Scanner teclado = new Scanner(System.in);
		i = 0 ;
		Produto p =null;
		do {
			try{
				System.out.println("----- Posição"+ i);
				p = new Produto();
				System.out.println("Digite o id do produto");
				int id = Integer.parseInt(teclado.nextLine());
				p.setId(id);
				System.out.println("Digite o nome do produto");
				String nome = teclado.nextLine();
				p.setNome(nome);
				System.out.println("Digite os detalhes do produto");
				String detalhes = teclado.nextLine();
				p.setDetalhes(detalhes);
				System.out.println("Digite o preço do produto");
				float preço = Float.parseFloat(teclado.nextLine());
				p.setPreço(preço);
				System.out.println("Digite a quantidade em estoque ");
				float estoque = Float.parseFloat(teclado.nextLine());
				p.setEstoque(estoque);
				
				
				
				i++;
				
				System.out.println(p);
				
			}catch(Exception ex) {
				System.out.println("--------> ops .. erro ao cadastrar");
				System.out.println("         Motivo :"+ex.getMessage());
			}
			finally {
			
				System.out.println("Situação até o momento"+ p );
			}
			
			
			
			
			
		}while(i < 5);
		for(i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
	}
	
}
	
	
