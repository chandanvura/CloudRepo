public class pattern34
{
	public static void main(String[] args) 
	{
		int space=4;
		int pair=1;
		for (int i=1;i<5 ;i++ )
		{
           for (int j=1;j<=space ;j++ )
           {
			   System.out.print(" ");
           }
		   for (int a=1;a<=pair ;a++ )
		   {
			   System.out.print("* ");
		   }
		   space--;
		   pair++;
		   System.out.println();
		}
	}
}