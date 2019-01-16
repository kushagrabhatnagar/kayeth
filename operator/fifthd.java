import java.util.*;
 
class fifthd
{
	public static void main(String args[])
	{
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter a single Character");
		char sc = ch.nextLine().charAt(0);
		if (((sc>='a')&&(sc<='z'))||((sc>='A')&&(sc<='Z')))
		{
			if((sc=='a')||(sc=='e')||(sc=='i')||(sc=='o')||(sc=='u')||(sc=='A')||(sc=='E')||(sc=='I')||(sc=='O')||(sc=='U'))
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonent");
			}
        }
        else 
        {
        	System.out.println("Wrong input");
        }	
    }
}