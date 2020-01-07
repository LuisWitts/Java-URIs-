import java.util.Scanner;
public class Uri1101 {
	public static void main (String args[]) {
		int x, y ;
		Scanner input = new Scanner(System.in);
		
		while (((x = input.nextInt()) > 0 )&&((y = input.nextInt()) > 0 )) {
			int sum = 0 ;
			if(x > y) {
				for(y = y ; y <= x ; y++ ) {
					sum +=y;
					System.out.print(y+" ");
					}
				System.out.print("Sum="+sum+"\n");
			}else {
				for (x = x; x <= y; x++) {
					sum+=x;
					System.out.print(x+" ");
				}
				System.out.print("Sum="+sum+"\n");
			}
		}
		input.close();

	}

}
