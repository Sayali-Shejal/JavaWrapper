public class BoxingApp1
{
     public static void main(String x[])
	 {
		Float a=6.4f;
		Double b=6.4;
		Integer i=200;
		
		long c=a.longValue();  //convert Float into long
		long d=b.longValue();  //convert Double into long
		long e=i.longValue();  //convert Integer into long
		
		System.out.println("C is ="+c);
		System.out.println("D is ="+d);
		System.out.println("E is ="+e);
		
	}	
}		