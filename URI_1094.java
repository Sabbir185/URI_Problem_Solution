import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int total=0,total_C=0,total_R=0,total_S=0 ;
		double percent_C=0,percent_R=0,percent_S=0;
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String  name ;
		
		for (int i = 0; i < N; i++) {
			
			total = scanner.nextInt();
			name = scanner.next();
			
			if (name.equals("C")) {
				total_C = total_C + total;
			}
			else if (name.equals("R")) {
				total_R += total;
			}
			else {
				total_S += total;
			}
			
			total=total_C+total_R+total_S;
		}
		
		System.out.println("Total: "+total+" cobaias");
		
		System.out.println("Total de coelhos: "+total_C);
		System.out.println("Total de ratos: "+total_R);
		System.out.println("Total de sapos: "+total_S);
		
		percent_C = (double)((total_C*100.00)/total);
		percent_R = (double)((total_R*100.00)/total);
		percent_S = (double)((total_S*100.00)/total);
		
		System.out.printf("Percentual de coelhos: %.2f",percent_C);
		System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f",percent_R);
		System.out.println(" %");
		System.out.printf("Percentual de sapos: %.2f",percent_S);
		System.out.println(" %");
 
    }
 
}
