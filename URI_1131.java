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
		int grenais_count=0, inter_count=0, gremio_count =0, draw_count = 0 ;
		
		while (true) {
			
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			grenais_count++ ;
			System.out.println("Novo grenal (1-sim 2-nao)");
			if( n>m ) 
				inter_count++ ;
			else if( n<m ) 
				gremio_count++ ;
			else 
				draw_count++ ;
			
			int one = scanner.nextInt();
			if( one == 1 ) {
				continue;
			}else if ( one == 2 ) {
				System.out.println(grenais_count+" grenais");
				System.out.println("Inter:"+inter_count);
				System.out.println("Gremio:"+gremio_count);
				System.out.println("Empates:"+draw_count);
				
				if( inter_count>gremio_count )
					System.out.println("Inter venceu mais");
				else if ( inter_count<gremio_count ) {
					System.out.println("Gremio venceu mais");
				}else if( inter_count == gremio_count ) 
					System.out.println("Não houve vencedor");
				break;
			}
		}
 
    }
 
}
