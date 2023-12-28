/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num =  Integer.parseInt(args [0]);
		for (int i=0; i<num;i++)
		{
			if (i%2==0)
			{
				System.out.print("*");
			}
			for(int j=0; j<num-1;j++)
			{
				System.out.print(" *");
			
				if (i%2==1)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print(" ");
				}

			System.out.println();
		}
	}
}

