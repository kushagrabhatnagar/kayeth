import java.util.*;
class box
{
	double height;
	double depth;
	double width;


box(double a,double b,int c)
{
	height=a;
	depth=b;
	width=c;
}

box()
{
	height=5;
	depth=5;
	width=5;

}

double volume()
{
	return depth*width*height;
}
}
class BoxDemo1
{
	
	public static void main (String[] args)
	{
		Box fig1=new Box(7,8,6);
		Box fig2=new Box();
		System.out.print("volume of fig1 "+fig1.volume() );
		System.out.print("volume of fig2 "+fig2.volume() 
		;
	}
}