public class ParseAppException
{   
    public static void main(String x[])
	{
	  try{
		String s="12345s";
		 int a=Integer.parseInt(s);
		 float b=Float.parseFloat(s);
		 Double c=Double.parseDouble(s);
		 
		System.out.println("Integer  a  is "+a);
		System.out.println("Float b  is "+b);
		System.out.println("Double c is "+c);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Error is "+ex);
		}
		
    }
	
}