public class ConverttoFloat
{
     public static void main(String x[])
	 {
		Long a=100L;
		Double b=6.4;
		Integer i=200;
		
		float c=a.floatValue();  //convert  long into Float
		float d=b.floatValue();  //convert Double into Float
		float e=i.floatValue();  //convert Integer into Float
		
		System.out.println("C is ="+c);
		System.out.println("D is ="+d);
		System.out.println("E is ="+e);
		
	}	
}		