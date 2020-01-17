using System; 

class URI {

    static void Main(string[] args) { 

        float sum=0,j=1.0f;
        for (float i = 1; i <=39 ; i+=2) {
            sum = sum + (i/j);
            j*=2;
        }
        Console.WriteLine(sum.ToString("F2"));

    }

}
