using System; 

class URI {

    static void Main(string[] args) { 

        int v,j=1;
    	v = int.Parse(Console.ReadLine());
    	
        int []sum = new int[10];
        
        for (int i = 0; i < sum.Length ; i++) {
            sum[i] = v * j ;
            j+=j ;
        }
        for (int i = 0; i < sum.Length ; i++) {
            Console.WriteLine("N[" + i + "] = " + sum[i]);
        }

    }

}
