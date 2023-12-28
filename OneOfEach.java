
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean isGirl = false;
		boolean isBoy = false;
		int count = 0;
		while(isGirl==false || isBoy==false)
		{
			int rand= (int)(Math.random()+0.5);
			if (rand==1)
			{
				isGirl=true;
			}
			else
			{
				isBoy=true;
			}
			count++;
		}
		System.out.println("You made it... and you now have "+ count +" children.");
	}
}
