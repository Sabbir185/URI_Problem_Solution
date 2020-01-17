import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        for (int i = 1; i <=9; i+=2 ) {
			
			for (int j = 7; j >=5; j--) {
				
				System.out.print("I="+i+" ");
				System.out.print("J="+j);
				System.out.println();
			}
		}
 
    }
 
}
