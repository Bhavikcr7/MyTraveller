import java.io.*;
public class MainPage 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int option;
		String s1,s2;
		
		System.out.println("Welcome to MyTraveller");
		
		System.out.println("Choose package : 1-> Indian  2-> Abroad 3-> Exit");
		s1=br.readLine();
		
		option=Integer.parseInt(s1);
		
		
		switch(option)
		{
			case 1:  
				int option2;
				String answer;
				System.out.println("Choose destination : 1-> Goa  2-> Manali");
				s2=br.readLine();
				option2=Integer.parseInt(s2);
				if(option2==1)
				{
						Goa g=new Goa();
						
						do
						{	
						
							Thread t1=new Thread(g,"goa");
							
							//Thread t5=new Thread(g,"goa1");
							
							
							
								t1.start();
								//t5.start();
								
							System.out.println("Book another Ticket? yes or no");
							answer=br.readLine();
						}
						while(answer.equals("yes"));
				}
					
				if(option2==2)
				{
						
					Manali m=new Manali();
						
					do
					{	
					
						Thread t2=new Thread(m,"manali");
							t2.start();
							try
							{
								t2.join();
							}
							catch(InterruptedException e) {}
						
						System.out.println("Book another Ticket? yes or no");
						answer=br.readLine();
				
					}
					while(answer.equals("yes"));
				}
	
			break;
			
			
			case 2:
				int option3;
				String answer2;
				System.out.println("Choose destination : 1-> Nepal  2-> China");
				s2=br.readLine();
				option3=Integer.parseInt(s2);
				if(option3==1)
				{
						Nepal n=new Nepal();
						
						do
						{	
						Thread t3=new Thread(n,"nepal");
							if(n.noOfTickets>0)
							{	n.getVisa();
								t3.start();
								try
								{
									t3.join();
								}
								catch(InterruptedException e) {}
								
							}
							else
								System.out.println("No tickets Left");
						
							System.out.println("Book another Ticket? yes or no");
							answer2=br.readLine();
						}
						while(answer2.equals("yes"));
				}
					
				if(option3==2)
				{
						
					China c=new China();
						
					do
					{	
						Thread t4=new Thread(c,"china");
						if(c.noOfTickets>0)
						{	c.getVisa();
							t4.start();
							
							try
							{
								t4.join();
							}
							catch(InterruptedException e) {}
							
						}else
							System.out.println("No tickets Left");
						
						System.out.println("Book another Ticket? yes or no");
						answer2=br.readLine();
				
					}
					while(answer2.equals("yes"));
				}
	
			break;
	
			case 3: System.exit(0);
		}
			
		
		
		System.out.println("Thank You....");	
		System.exit(0);
		
		
		
		
	}
	
}
