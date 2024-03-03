public class pattern31
{
	public static void main(String[] args) 
	{
		int space=0;
		int star=9;
		for (int i=1;i<=9 ;i++ )
		{
			for (int j=1;j<=space ;j++ )
			{
				System.out.print("   ");
			}
			for (int a=1;a<=star ;a++ )
			{
				System.out.print(" * ");
			}
			if (i<=4)
			{
				star-=2;
				space++;
			}
			else 
			{
				star+=2;
				space--;
			}
			System.out.println();
		}
	}
}