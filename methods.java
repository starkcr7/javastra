class methods
{
	public static int Minfunction(int n1,int n2){
		int min;
		if(n1>n2)
		{
			min=n2;
		}
		else 
		{
			min=n1;
		}
		return min;
	}
	public static int Maxfunction(int n1,int n2)
	{
		int max;
		if(n1<n2)
		{
			max=n2;
		}
		else 
		{
			max=n1;
		}
		return max;
	}
public static void main(String[] args) {
	int a=11;
	int b=6;
	int c=Minfunction(a,b);
	int d=Maxfunction(a,b);
	System.out.println("Minimum value="+c);
	System.out.println("Maximum value="+d);
	
}
}