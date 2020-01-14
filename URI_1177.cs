using System; 

class URI {

    static void Main(string[] args) { 

        int []arr = new int[1000];
        int j = 0;
        int n = int.Parse(Console.ReadLine());
        for (int i = 0; i < arr.Length ; i++) {
            if (j==n)
            {
                j=0;
            }
            Console.WriteLine("N["+i+"] = "+j);
            j++;
        }

    }

}
