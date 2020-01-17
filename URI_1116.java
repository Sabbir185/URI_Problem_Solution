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
		int N = scanner.nextInt();
		int x,y;
		double result;
		
		for (int i = 0; i < N; i++) {
			
			x = scanner.nextInt();
			y = scanner.nextInt();
			
			if ( y==0 ) {
				System.out.println("divisao impossivel");
			}else {
				result = ((double)x) / ((double)y);
				System.out.printf("%.1f\n",result);
			}
			
		}
 
    }
 
}
