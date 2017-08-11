class square_root
{
	public static void main(String args[])
	{
		int a=121;
		double g1=0,square=a/2;
		do	
		{		g1=square;
			square=(g1+(a/g1))/2;
		}while((g1-square)!=0);
		System.out.print(square);
	}


}