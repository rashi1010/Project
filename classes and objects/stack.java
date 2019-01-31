class stack
{
 public static void main(String[] args) {
	
}
		int st[]= new int[10];
		int tos=-1;
		void spaceleft()
		{
			int d=9-tos;
			System.out.println("Space left :" +d);
		}
		boolean isempty()
		{
			if(tos==-1)
			return true;
			else 
			return false;
		}
		boolean isfull()
		{
			if(tos>=9)
			return true;
			else 
			return false;
		}
	

		void push(int a)
		{
			if(!isfull())
			{	tos++;
				st[tos]=a;
			}	
			else
			{
				System.out.println("full");
			}
		}
		void pop()
		{
			if(!isempty())
			{tos--;
			System.out.println("popped");
			}	
			else
			System.out.println("empty");
		}
		void display()
		{
			for(int i=tos;i>=0;i--)
			System.out.println(st[i]);
		}
	}	
	}