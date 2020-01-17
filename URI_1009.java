import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		String name ;
		double Salary,Total;
		name = sc.next();
		Salary = sc.nextDouble();
		Total = sc.nextDouble();
		Total = ( ( Total*15)/100 ) + Salary ;
		System.out.printf("TOTAL = R$ %.2f\n",Total);
 
    }
 
}
