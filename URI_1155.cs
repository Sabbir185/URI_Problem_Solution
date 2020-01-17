using System; 

class URI {

    static void Main(string[] args) { 

        float sum=0;
        for (float i = 1; i <=100 ; i++) {
            sum = sum + (1/i);
        }
        Console.WriteLine(sum.ToString("F2"));

    }

}
