class stackmain
	{
		public static void main(String args[])
		{
			Scanner in= new Scanner(System.in);
			stack s1 = new stack();
			int i,k,j;
			do
			{
				System.out.println(" Enter 1 to push \n Enter 2 to pop \n Enter 3 to check size left \n Enter 4 to display");
				j=in.nextInt();
				switch(j)
				{
					case 1: 
							{
								System.out.println("Enter no.");
								k=in.nextInt();
								s1.push(k);
								break;
							}
					case 2: 
							{
								s1.pop();
								break;
							}
					case 3: 
							{
								s1.spaceleft();
								break;
							}
					case 4:
							{
								s1.display();
								break;
							}
					default :
							{
								System.out.println("Wrong input");
								break;
							}
				}
				System.out.println("press 1 to try again");
				i=in.nextInt();
			}
			while(i==1);	
		}
	}