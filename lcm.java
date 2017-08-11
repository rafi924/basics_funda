class lcm
{
	public static void main(String args[])
	{
      int a[]={4,12,34,21,2,34,12,45,67};        
		int i=0,v=1,posn=0,j=1;
		while(v<=a.length)
		{
		v=1;
			if(v<=a.length)
			{
		for(  i=0;i<a.length;i++)
		{
		if(j%a[i]==0)
			{
				if(j!=1)
				v++;
			posn=j;
				}
		}
			}
			j++;
		}
	System.out.print("the L.C.M OF THE SERIES IS"+" "+posn);
}
}