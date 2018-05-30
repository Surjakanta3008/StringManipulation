import java.io.*;
import java.util.*;
class CountCharacters
{
	public static void main (String ar[]) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=s1.toLowerCase();
		char[] charArray=s2.toCharArray();
		for(char i='a';i<'z';i++)
		{
			for(char ch:charArray)
			{
				if(ch==i)
				{
					count=count+1;
				}
			}
			if(count!=0)
			{
				System.out.println(i +" = "+count);
				count=0;
			}
		}
	}
}
