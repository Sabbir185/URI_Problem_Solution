using System; 

class URI {

    static void Main(string[] args) { 

        int N = int.Parse(Console.ReadLine() );
        int []a = new int[N];
        int []b = new int[N];
        a[0]=0;
        a[1]=1;

        for (int i = 2; i <N ; i++) {

            a[i] = a[i-1]+a[i-2];
        }

        Console.Write(a[0]);
        for (int i = 1; i <N; i++) {
            Console.Write(" "+a[i]);
        }
        Console.WriteLine();

    }

}
