package simpleTableau;

import java.util.Scanner;

public class LinearCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter current solution : ");
        double current_sol = scanner.nextInt();
        System.out.print("Enter number of new solutions : ");
        int n = scanner.nextInt();
        double new_sol[] = new double[n];
        double T[] = new double[n];
        double p[] = new double[n];
        double E,x;

        System.out.println("Now,enter new solutions");
        for (int i=0; i<n; i++ )
        {
            new_sol[i] = scanner.nextInt();

        }
        System.out.println("Enter temperatures : ");
        for (int i = 0; i <n ; i++) {
            T[i] = scanner.nextInt();
        }

        for (int i = 0; i <n ; i++) {
            E = new_sol[i] - current_sol ;
            x = ( -(E)/(T[i]) );
            
            p[i] =  (1/(1+Math.exp(x)));
        }

        System.out.println("Current solution is : "+current_sol);
        System.out.println("eval(n)    temperature    A_Probability");
        for (int i = 0; i <n ; i++) {
            System.out.print(new_sol[i]+"         ");
            System.out.print(T[i]);
            System.out.printf("           %.2f",p[i]);
            System.out.println(" %");
            System.out.println();
        }
        

	}

}
