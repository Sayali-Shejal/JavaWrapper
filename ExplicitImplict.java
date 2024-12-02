public class ExplicitImplict
{
	public static void main(String args[])
	{
		int a=10;
		long b;
		b=a;//implict conversion 
		
		System.out.printf("implict conversion ,B =%d\n",b);
		
		long d=100;
		int  e=(int)d;//Explicit conversion
		System.out.printf("Explicit conversion ,E =%d\n",e);
		
	}
}