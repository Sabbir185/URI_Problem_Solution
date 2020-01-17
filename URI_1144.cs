using System; 

class URI {

    static void Main(string[] args) { 

        int n,a,b,c;
        n = int.Parse(Console.ReadLine());
        for(int i=1;i<=n;i++)
        {
            a=i;
            b=i*i;
            c=i*i*i;
            Console.WriteLine(a+" "+b+" "+c);
            b++;
            c++;
            Console.WriteLine(a+" "+b+" "+c);
        }
        Console.Read();
    }

}
