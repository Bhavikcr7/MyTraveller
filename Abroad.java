
public abstract class Abroad implements Runnable {
	
	
public int noOfTickets;
	
	public void showAvailability()
	{
		
		System.out.println(noOfTickets);
	}
	
	 
	synchronized public void run()
	{		
		System.out.println("Tickets left  "+noOfTickets);
		
		if( noOfTickets>0 )
		{		try {
			
				
				noOfTickets--;
				
				System.out.println(Thread.currentThread().getName()+"  Booked successfully");
				
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}

	public abstract void getVisa();
}
