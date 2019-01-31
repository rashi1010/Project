class date
{
public static void main(String[] args) {
	
}	
	int year;
	int month;
	int day;
	date(int a,int b,int c )
	{
		month=a;
		day=b;
		year=c;


	}
	date();
	{
		year=1;
		month=1;
		day=2000;
	}
	void display();
	{
		System.out.println("Date :"+month+ "/" +day+ "/" +year);
	}
}
class datemain
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int m,d,y;
		System.out.println("Enter month");
		m=in.nextInt();
		System.out.println("Enter date");
		d=in.nextInt();
		System.out.println("Enter year");
		y=in.nextInt();
		date d1 = new date(m,d,y);
		d1.display();
		date d2 = new date();
		d2.display();
	}
}