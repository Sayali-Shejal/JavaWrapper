import java.util.*;
public class StringBuffApp
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        boolean exit = false;
		
		while (!exit) 
		{
			System.out.println("\nString Operations Menu:");
			System.out.println("1.Enter Your String =");
			System.out.println("2.Reversing a String.");
			System.out.println("3. Inserting Characters. ");
			System.out.println("4.Appending String.");
			System.out.println("5. Deleting characters from String. ");
			System.out.println("6.Replace a Substring.");
			System.out.println("7. Check Capacity, Ensure Capacity from StringBuffer class.");
			System.out.println("8.Demostreat chanining Methods b using StringBuffer");
			System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
			
			switch(choice)
			{
				case 1:
				    System.out.print("Enter a string: ");
                    String str = sc.nextLine();
                    stringBuffer.setLength(0); // Reset the StringBuffer
                    stringBuilder.setLength(0); // Reset the StringBuilder
                    stringBuffer.append(str);
                    stringBuilder.append(str);
                    System.out.println("String set.");
                    break;
				case 2:
					System.out.println("Reversed StringBuffer: " + stringBuffer.reverse());
                    stringBuffer.reverse(); //reset
                    System.out.println("Reversed StringBuilder: " + stringBuilder.reverse());
                    stringBuilder.reverse(); // Reset 
                    break;
					
				case 3:
					System.out.print("Enter characters to insert: ");
                    String insert = sc.nextLine();
                   
				
			}
		}
	}
}