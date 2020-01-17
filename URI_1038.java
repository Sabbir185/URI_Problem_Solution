import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scanner = new Scanner(System.in);
		int X,Y;
		double total ;
		X = scanner.nextInt();
		Y = scanner.nextInt();
		
		if ( X == 1 ) {
			total = ( Y*4);
			System.out.printf("Total: R$ %.2f\n",total);
		}
		else if ( X==2 ) {
			total = ( Y*4.50);
			System.out.printf("Total: R$ %.2f\n",total);
		}
		else if ( X==3 ) {
			total = ( Y*5.00);
			System.out.printf("Total: R$ %.2f\n",total);
		}
		else if ( X==4 ) {
			total = ( Y*2.00);
			System.out.printf("Total: R$ %.2f\n",total);
		}
		else if ( X==5 ) {
			total = ( Y*1.50);
			System.out.printf("Total: R$ %.2f\n",total);
		}
		
 
    }
 
}
