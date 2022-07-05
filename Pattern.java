/*
a
B c
D e F
g H i J
k L m N o
*/

class Pattern
{
	public static void main(String[] args) 
	{
	
	int al=64;
	int ak=96;
	int k=1;
        for(int i=0;i<5;i++)
        {
		for(int j=0;j<=i;j++)
        	{
           
		if(k%2==0)
           		 System.out.print((char)(k+al)+" ");
		else
           		 System.out.print((char)(k+ak)+ " ");
		k++;
	
       		 }
		System.out.println();
	}
	}
}
	