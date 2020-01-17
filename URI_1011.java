import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		double pie= 3.14159 ;
		double R = sc.nextDouble();
		double result = (4.0/3)*pie*(R*R*R);
		System.out.printf("VOLUME = %.3f\n",result);
    }
 
}
