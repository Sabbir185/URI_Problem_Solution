using System; 

class URI {

    static void Main(string[] args) { 

       int x = int.Parse(Console.ReadLine());
        int multi=1;
        for (int i = 1; i <=x ; i++) {

            multi = multi*i;
        }
        Console.WriteLine(multi);

    }

}
