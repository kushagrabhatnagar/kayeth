import java.util.*;

class fourthd
{
	public static void main(String args[])
	{
		int x,n,i,j,k,l,num,series;
        k=1;
        series=1;
		Scanner input =new Scanner(System.in);
        System.out.println("enter the value of x");
        x = input.nextInt();
        System.out.println("enter the no. of terms");
        n = input.nextInt();
        for(i=1;i<n;i++)
        {
            k=i;
            int fact=1;
        	for(j=k;j>1;j--)
        	{
        		fact=fact*j;   // factorial
        	}
        	num=1;
        	for(l=0;l<i;l++)   // power
            {
        	num=num*x;
            }
        series=series+(num/fact);
        }
	System.out.println("sum of series : "+series);
    }
}