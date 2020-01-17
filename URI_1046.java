import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

		int start_time, end_time, durationtm;
		start_time = scanner.nextInt();
		end_time = scanner.nextInt();
		
		durationtm = end_time - start_time ;
		
		if ( durationtm < 0 ) {
			
			durationtm = 24 + ( end_time - start_time ) ;
		}
		
		if ( start_time == end_time ) {
			System.out.printf("O JOGO DUROU 24 HORA(S)\n");
		}
		else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n",durationtm);
		}
 
    }
 
}
