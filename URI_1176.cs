using System; 

class URI {

    static void Main(string[] args) { 

        long []arr = new long[61];
        arr[0]=0;
        arr[1]=1;
        int n,t;
        n= int.Parse(Console.ReadLine());
        for (int i = 2; i <=60 ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        for (int i = 0; i <n ; i++) {
            t = int.Parse(Console.ReadLine());
            Console.WriteLine("Fib("+t+") = "+arr[t]);
        }

    }

}
