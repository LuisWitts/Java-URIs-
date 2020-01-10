import java.util.Scanner;

public class Uri1060 {
	public static void main(String [] arg) {
		Scanner input = new Scanner(System.in);
		double a;
		int positivos = 0;
		
		for(int i=0; i < 6; i++) {
			a = input.nextDouble();
			if(a > 0) {
				positivos +=1;
					input.close();
			}
		}
		System.out.print(positivos + " valores positivos\n");
		
	
		
		
		
		
		
		
		
	}
	

}
