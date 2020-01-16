using System; 

class URI {

    static void Main(string[] args) { 

        int []x = new int[10];
	for( int i=0; i<10; i++ )
	{
	    x[i]=Convert.ToInt32(Console.ReadLine());
	    if( x[i]<=0 )
	        x[i]=1;
	}
	for( int j=0; j<10; j++ )
	{
	    Console.WriteLine("X["+j+"]"+" = "+x[j]);
	}

    }

}
