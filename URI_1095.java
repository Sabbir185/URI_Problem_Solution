import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int I=1;
		for (int i = 60; i>=0; i-=5 ) {
			
			    System.out.print("I="+I+" ");
			    I+=3;
				System.out.print("J="+i);
				System.out.println();
			}
 
    }
 
}
