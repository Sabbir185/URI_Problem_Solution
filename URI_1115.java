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
		int x,y;
		while (true) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			if (x>0 && y>0)
				System.out.println("primeiro");
			else if( x>0 && y<0)
				System.out.println("quarto");
			else if( x<0 && y<0 )
				System.out.println("terceiro");
			else if(x<0 && y>0)
				System.out.println("segundo");
			else 
				break;
		}
 
    }
 
}
