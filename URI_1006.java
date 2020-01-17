import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double c = sc.nextDouble();
		double MEDIA = ( (A*2) + (B*3) + (c*5) ) / 10 ;
		System.out.printf("MEDIA = %.1f\n",MEDIA);
 
    }
 
}
