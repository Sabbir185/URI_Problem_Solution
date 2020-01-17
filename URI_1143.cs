using System; 

class URI {

    static void Main(string[] args) { 

        int n,i;
        n = int.Parse(Console.ReadLine());
        for(i = 1;i <= n;i++){
            Console.WriteLine(i+" "+(i*i)+" "+(i*i*i) );
        }
        Console.Read();

    }

}
