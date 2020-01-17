import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int spendTime = scanner.nextInt();
		int avgSpeed = scanner.nextInt();

		double literSpend =  (spendTime * avgSpeed) ;
		
		double result = literSpend / 12 ;

		System.out.printf("%.3f\n",+result);
    }
 
}
