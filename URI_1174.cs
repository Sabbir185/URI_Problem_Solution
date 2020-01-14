using System; 

class URI {

    static void Main(string[] args) { 

        float []arr = new float[100];
        for (int i = 0; i < 100 ; i++) {
            arr[i] = float.Parse(Console.ReadLine());
        }

        for (int i = 0; i < 100; i++) {
            if (arr[i]<=10)
            {
                Console.WriteLine("A["+i+"] = "+arr[i].ToString("F1") );
            }
        }

    }

}
