import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       	Scanner sc = new Scanner(System.in);
		int age ;
		age = sc.nextInt();
		
		int year = ( age / 365 );
		int yearmod = ( age % 365 );
		int month = ( yearmod / 30 );
		int day = ( yearmod % 30 );
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",year,month,day);
 
    }
 
}
