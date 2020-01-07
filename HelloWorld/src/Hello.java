
public class Hello {
	public static void main(String arg[]) {
		
		float salarioMinimo, qtdKw;
		
		
		salarioMinimo = Float.parseFloat(arg[0]);
		qtdKw         = Float.parseFloat(arg[1]);
		
		float valor1kw = salarioMinimo/700;
		float valorTotal = valor1kw * qtdKw;
		
		float desc = valorTotal * 0.9f;
		
		
		System.out.println("Valor 1 KW R$"+ valor1kw);
		System.out.println("Valor Total R$"+ valorTotal );
		System.out.println("Valor com 10% de Desconto R$"+ desc);

	}

}
