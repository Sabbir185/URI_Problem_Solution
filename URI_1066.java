import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		int input,even=0,odd=0,positive=0,neg=0;
	    for(int i=0; i<5; i++)
	    {
	        input=scanner.nextInt();
	        if( input%2==0)
	        {
	            even++;
	        }
	        if( input%2==1 || input%2==-1)
	        {
	            odd++ ;
	        }
	        if( input>0)
	        {
	            positive++;
	        }
	        if( input<0 )
	        {
	            neg++;
	        }
	    }

	    System.out.printf("%d valor(es) par(es)\n",even);

	    System.out.printf("%d valor(es) impar(es)\n",odd);

	    System.out.printf("%d valor(es) positivo(s)\n",positive);

	    System.out.printf("%d valor(es) negativo(s)\n",neg);

 
    }
 
}
