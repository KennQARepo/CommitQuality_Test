public class Starry_v3
{
  public static void main (String[]args)
  {
    int limit = 5;
    int start = 0;
    int spot = 5;
    String star = "*";
    String space = " ";
    while (spot >= 0)
      {
	for (start = 0; start <= limit; start++)
	  {
	    if (start >= spot)
	      {
		System.out.print (star);
	      }
	    else
	      {
		System.out.print (space);
	      }
	  }
	  System.out.println(" ");
	spot--;
      }
  }
}
