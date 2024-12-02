public class ConverttoByte
{
     public static void main(String x[])
	 {
		Long a=100L;
		Float b=6.4f;
		Integer i=200;
		
		
		byte c=a.byteValue();  //convert  long into byte
		byte d=b.byteValue();  //convert Float into byte
		byte e=i.byteValue();  //convert Integer into byte
		
		System.out.println("C is ="+c);
		System.out.println("D is ="+d);
		System.out.println("E is ="+e);
		
	}	
}		