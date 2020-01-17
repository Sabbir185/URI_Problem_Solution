import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		int NUMBER,B; float C;
		NUMBER = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextFloat();
		System.out.println("NUMBER = "+NUMBER);
		System.out.printf("SALARY = U$ %.2f\n",B*C);
    }
 
}
