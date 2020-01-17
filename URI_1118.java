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
		while (true) {
			float score;
			float avg, count = 0, store = 0;

			while (true) {

				score = scanner.nextFloat();

				if (score >= 0 && score <= 10) {
					store += score;
					count++;
				} else
					System.out.println("nota invalida");
				if (count == 2)
					break;

			}

			avg = store / 2.00f;
			System.out.printf("media = %.2f\n", avg);
			int N;
			while(true)
			{
				N = scanner.nextInt();
				System.out.println("novo calculo (1-sim 2-nao)");
				if ( N==1 || N==2 ) {
					break;
				}
			}
			if(N==1)continue;
			else if (N==2)break;
			
		}
 
    }
 
}
