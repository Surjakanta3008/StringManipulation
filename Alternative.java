import java.io.*;
import java.util.Scanner;
class Alternative
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(i%2==0)
			{
				System.out.print(Character.toLowerCase(ch));
			}
			else
			{
				System.out.print(Character.toUpperCase(ch));
			}
		}
		System.out.println();
	}
}
				
