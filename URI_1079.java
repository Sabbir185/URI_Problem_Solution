import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		int n;
	    float x,y,z,sum;
	    n = scanner.nextInt();
	    for(int i=1; i<=n; i+=1 )
	    {
	    	 x = scanner.nextFloat();
	    	 y = scanner.nextFloat();
	    	 z = scanner.nextFloat();
	        sum = ((x/10)*2 )+((y/10)*3)+((z/10)*5);
	        System.out.printf("%.1f\n",sum);
	    }

 
    }
 
}
