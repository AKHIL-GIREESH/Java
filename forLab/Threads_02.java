class First 
{
	synchronized public void display()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

    synchronized public void even()
	{
		try
		{
			for(int i=0;i<5;i=i+2)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Second extends Thread
{
	First obj;
	Second(First ob)
	{
		obj=ob;
	}
	public void run()
	{
		obj.display();
        obj.even();
	}
}
class Threads_02{
	public static void main(String args[]){
		First ob=new First();
		Second s=new Second(ob);
	    // Second s1=new Second(ob);
		s.start();
        //s1.start();
	}
}
