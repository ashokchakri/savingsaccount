import java.util.Scanner;
public class Wordscounter {
	public static void main(String[] args)
   {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=s.nextLine();
		String words[]=str.split(" ");
		for(String a:words)
		{
			
			System.out.println(a+" --size is "+a.length());
		}
		
		
   }
}
