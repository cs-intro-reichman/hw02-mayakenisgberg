/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args [0]);
		double avg = 0.0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int mode = 0;
		for (int j=0;j<t;j++)
		{
			boolean isGirl = false;
			boolean isBoy = false;
			int count = 0;
			while(isGirl==false || isBoy==false)
				{
					double rand= Math.random();
					if (rand<0.5)
						{
							isGirl=true;	
						}
					else 
						{
							isBoy=true;
						}
					count++;
				}
			avg+=count;
			if (count==2)
			{
				count2++;
			}
			else
				{
					if(count==3)
					{
						count3++;
					}
					else 
					{
						count4++;
					}
				}

		}
		avg = avg/t;
		mode=Math.max(count2, Math.max(count3,count4));
		System.out.println("Average: "+avg+" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+count2);
		System.out.println("Number of families with 3 children: "+count3);
		System.out.println("Number of families with 4 or more children: "+count4);
		if (mode==count2)
		{
			System.out.println("The most common number of children is 2.");
		}
		else
			{
			if (mode==count3)
				{
				System.out.println("The most common number of children is 3.");
				}	
			else
				{
			
				System.out.println("The most common number of children is 4 or more.");
				}
			}

		}
}
