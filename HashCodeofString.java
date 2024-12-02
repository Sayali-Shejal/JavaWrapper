public class HashCodeofString
{
	public static void main(String arg[])
	{
		String str1="ABC";
		String str2="ABC";
		
		System.out.println("HashCode of str1 ="+System.identityHashCode(str1));
		System.out.println("HashCode of str2 ="+System.identityHashCode(str2));
	
		String str3=new String("ABC");
		String str4=new String("ABC");
		
		System.out.println("HashCode of str3 ="+System.identityHashCode(str3));
		System.out.println("HashCode of str4 ="+System.identityHashCode(str4));
	
		
		
	}
}	