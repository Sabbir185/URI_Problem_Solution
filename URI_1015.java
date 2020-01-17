import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double x1,x2,y1,y2,distance;
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  x1 = scanner.nextDouble();
		  y1 = scanner.nextDouble();
		  x2 = scanner.nextDouble();
		  y2 = scanner.nextDouble();
		  
		  distance = Math.sqrt( Math.pow(x2-x1,2)+Math.pow(y2-y1,2) );
		  
		  System.out.printf("%.4f\n",distance);
 
    }
 
}
