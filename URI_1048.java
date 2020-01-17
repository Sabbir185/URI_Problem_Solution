import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		float number;
		number = scanner.nextFloat();
		
		if ( number<=400.00 ) {
			
			float percent = ( (number*15) / 100  );
			float newSalary = ( percent + number );
			
			System.out.printf("Novo salario: %.2f\n",newSalary);
			System.out.printf("Reajuste ganho: %.2f\n",percent);
			System.out.printf("Em percentual: 15 %%\n");
		}
		else if ( number>=400.01 && number<=800.00 ) {
			float percent = ( (number*12) / 100  );
			float newSalary = ( percent + number );
			
			System.out.printf("Novo salario: %.2f\n",newSalary);
			System.out.printf("Reajuste ganho: %.2f\n",percent);
			System.out.printf("Em percentual: 12 %%\n");
		}
		else if ( number>=800.01 && number<=1200.00 ) {
			float percent = ( (number*10) / 100  );
			float newSalary = ( percent + number );
			
			System.out.printf("Novo salario: %.2f\n",newSalary);
			System.out.printf("Reajuste ganho: %.2f\n",percent);
			System.out.printf("Em percentual: 10 %%\n");
		}
		else if ( number>=1200.01 && number<=2000.00 ) {
			float percent = ( (number*7) / 100  );
			float newSalary = ( percent + number );
			
			System.out.printf("Novo salario: %.2f\n",newSalary);
			System.out.printf("Reajuste ganho: %.2f\n",percent);
			System.out.printf("Em percentual: 7 %%\n");
		}
		else if ( number >= 2000.00 ) {
			float percent = ( (number*4) / 100  );
			float newSalary = ( percent + number );
			
			System.out.printf("Novo salario: %.2f\n",newSalary);
			System.out.printf("Reajuste ganho: %.2f\n",percent);
			System.out.printf("Em percentual: 4 %%\n");
		}
 
    }
 
}
