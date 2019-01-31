class employeemain
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		//Scanner st= new Scanner(System.in);
		int y,e,i;
		String n;
		String a;
		String x;
		String z;
		System.out.println("How many employees ?");
		e=in.nextInt();
				employee tub[]= new employee[e];
		for(i=0;i<e;i++)
		{
		System.out.println("Enter Name");
		n=in.nextLine();
		n=in.nextLine();
		System.out.println("Enter city");
		a=in.nextLine();
		System.out.println("Enter salary");
		y=in.nextInt();
		System.out.println("Enter department");
		x=in.nextline();
		System.out.println("Enter code");
		z=in.nextline();
		tub[i]=new employee(n,a,y,x,z);
		}
		System.out.println("Name\tcity\tsalary\tdepartment\tcode");
		for(i=0;i<e;i++)
		{
			tub[i].display();
		}


	}
}