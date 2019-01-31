import java.util.*;
	class distancemain
	{
		public static void main(String args[])
		{
			Scanner in= new Scanner(System.in);
			int feet,inch,feet1,inch1;
			System.out.println("Enter distance in feet");
			feet=in.nextInt();
			System.out.println("Enter distance in inch");
			inch=in.nextInt();
			System.out.println("Enter distance in feet");
			feet1=in.nextInt();
			System.out.println("Enter distance in inch");
			inch1=in.nextInt();
			distance d3 = new distance();
			distance d1 = new distance(feet,inch);
			d1.displaysum(d3);
			//System.out.println(d3.f+ " "+d3.i);
			distance d2 = new distance(feet1,inch1);
			d2.displaysum(d3);
			System.out.println(d3.f+ " "+d3.i);
		}
	}