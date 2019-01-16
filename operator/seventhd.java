import java.util.*;

class seventhd
{
    public static void main(String args[])
    {
        int r, i, k, j,l,n;
        char let='a';
        Scanner scan =new Scanner(System.in);
       do
       {
            System.out.print("Enter Number of Rows : ");
            r = scan.nextInt();
            
            for(i=0;i<r;i++)
            {
                for(k=r; k>i; k--)
                {
                    System.out.print(" ");
                }
                let = 'A';
                for(j=0;j<=i;j++)
                {
                    System.out.print(let);
                    let++;
                }
                let--;
                for(l=0;l<=i;l++)
                {
                    let--;
                    if(let>='A')
                    {
                        System.out.print(let);
                    }    
                }
                System.out.println("");
            }
            for(i=(r-1);i>0;i--)
            {
                for(k=(r); k>=i; k--)
                {
                    System.out.print(" ");
                }
                let = 'A';
                for(j=0;j<i;j++)
                {
                    System.out.print(let);
                    let++;
                }
                let--;
                for(l=0;l<=i;l++)
                {
                    let--;
                    if(let>='A')
                    {
                        System.out.print(let);
                    }    
                }
                System.out.println("");
            }
            System.out.println("Press 1 to try again and 2 to exit");
            n = scan.nextInt();
        }
        while(n==1);
    }
}
