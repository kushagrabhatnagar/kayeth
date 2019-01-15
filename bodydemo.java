import java.util.*;
class Box
{
	double Width,Height,Depth;
	void setDim()
	{
       Scanner con=new Scanner (System.in);
       System.out.print("enter the height : ");
       Height=con.nextInt();
       System.out.print("enter the width : ");
       Width=con.nextInt();
       System.out.print("enter the depth : ");
       Depth=con.nextInt();		
	}
	double volume()
{
	return Height*Width*Depth;
}
}

    class BoxDemo
{
   public static void main(String[] args)
   {
	Box var=new Box();
    var.setDim();
    double vol=var.volume();
    System.out.print("volume is " +vol);
    }
}