using System; 

class URI {

    static void Main(string[] args) { 

        int t = int.Parse(Console.ReadLine());
        int sum,n;
        for (int i = 1; i <= t ; i++) {
            n = int.Parse(Console.ReadLine());
            sum=0;
            for (int j = 1; j < n ; j++) {
                if ( n%j==0 )
                {
                    sum = sum+j;
                }
            }
            if (sum==n)
                Console.WriteLine(n+" eh perfeito");
            else
                Console.WriteLine(n+" nao eh perfeito");
        }

    }

}
