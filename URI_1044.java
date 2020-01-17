import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scanner = new Scanner(System.in);
		int a,b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if( a%b == 0 || b%a==0 )
		{
			System.out.printf("Sao Multiplos\n");
		}
		else {
			System.out.printf("Nao sao Multiplos\n");
		}
		
    }
 
}
