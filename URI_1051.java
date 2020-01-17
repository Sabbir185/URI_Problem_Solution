import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		if( salary>=0.00 && salary<=2000.00 )
	    {
	       System.out.printf("Isento\n");
	    }
	    else if( salary>=2000.01 && salary<=3000.00 )
	    {
	        System.out.printf("R$ %.2f\n",(salary-2000.00)*0.08);
	    }
	    else if( salary>=3000.01 && salary<=4500.00 )
	    {
	        System.out.printf("R$ %.2f\n",(salary-3000.00)*0.18 + (1000.00*0.08));
	    }
	    else
	    {
	        System.out.printf("R$ %.2f\n",(salary-4500.00)*0.28 + (1500.00*0.18) + (1000.00*0.08));
	    }

 
    }
 
}
