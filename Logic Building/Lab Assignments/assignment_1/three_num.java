public class three_num {
	public static void main (String args[])
	{
		int a = 9, b = 4 , c  = 1;
		if ( a > b)
		{
			if (a>c)
			{	
				System.out.println(a + " is largest number" );
			} else 
			{
				System.out.println(c + " is largest number" );

			}

		} else if ( b > c)
		{
			System.out.println(b + " is largest number" );

		}  else 
			{
				System.out.println(c + " is largest number" );

			}
	}

}