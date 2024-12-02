import java.util.*;
public class altMergeApps
{
     public static void main(String x[])
	 {
	     String first;
		 Scanner xyz  = new Scanner(System.in);
		 System.out.println("Enter data in first string");
		 first=xyz.nextLine();
		 
		 String words[]=first.split(" ");
		 StringBuffer sb = new StringBuffer();
		 for(String word:words)
		 {   String s="";
	        for(int i=(word.length()-1);i>=0;i--)
			{ s=s+word.charAt(i);
			}
			s=s+" ";
			sb.append(s);
		 }
		 System.out.println(sb);
		  
	 }
}
// abc mno pqr
// cba onm rqp