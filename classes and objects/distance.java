class distance
	{
public static void main(String[] args){	
		float f,i;
		distance(float a,float b)
		{
			f=a;
			i=b;
		}
		distance()
		{
			f=0;
			i=0;
		}
		void displaysum(distance c)
		{
			c.f=c.f+f+(int)i/12;
			c.i=c.i+i%12;
			if(c.i/12>=1)
			{
				c.f=c.f+(int)c.i/12;
				c.i=c.i%12;
			}
		}
	}	
	}