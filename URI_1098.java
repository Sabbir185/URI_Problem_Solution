import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       int a,b;
		for (float i = 0; i < 2.2; i += 0.2) {

			for (float j = 1; j <= 3; j++) {

				if ((i > 0 && i < 1) || (i >1 && i < 2) )
				{
					System.out.printf("I=%.1f J=%.1f\n", i, (j + i));
				}
				else 
				{
					a = (int) i;
					b = (int) (j+i);
					System.out.printf("I=%d J=%d\n", a, b);
				}
			}
		}
    
    
 
    }
 
}
