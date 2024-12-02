public class ConverttoDouble
{
     public static void main(String x[])
	 {
		Long a=100L;
		Float b=6.4f;
		Integer i=200;
		
		double c=a.doubleValue();  //convert  long into double
		double d=b.doubleValue();  //convert Float into double
		double e=i.doubleValue();  //convert Integer into double
		
		System.out.println("C is ="+c);
		System.out.println("D is ="+d);
		System.out.println("E is ="+e);
		
	}	
}		