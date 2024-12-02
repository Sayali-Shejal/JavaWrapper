public class BoxingApp
{
     public static void main(String x[])
	 {
		Float a=5.4f;
		Double b=5.4;
		Long l=100L;
		
		int c=a.intValue();  //convert float into integer
		int d=b.intValue();  //convert Double into integer
		int e=l.intValue();  //convert Long into integer
		
		System.out.println("C is ="+c);
		System.out.println("D is ="+d);
		System.out.println("E is ="+e);
	 }
}