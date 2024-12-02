public class AutoBoxingApp
{
	public static void main(String arg[]);
	{
		int a=100;
		Integer b=a;//Auto boxing
		System.out.println("B is ="+b);
		
		Integer d=200;
		int e=d;// Auto unboxing
		System.out.println("E is ="+e);
	}
}