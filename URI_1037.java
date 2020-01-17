import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scanner = new Scanner(System.in);
		float n = scanner.nextFloat() ;
	
			if (n>=0 && n<=25.0000) {
				System.out.printf("Intervalo [0,25]\n");
			}
			else if (n>=25.00001 && n<=50.0000000) {
				System.out.printf("Intervalo (25,50]\n");
			}
			else if ( n>50.00001 && n<=75.0000000 ) {
				System.out.printf("Intervalo (50,75]");
			}
			else if (n>=75.00001 && n<=100.0000000) {
				System.out.printf("Intervalo (75,100]\n");
			} 
			else {
				System.out.printf("Fora de intervalo\n");
			}
 
    }
 
}
