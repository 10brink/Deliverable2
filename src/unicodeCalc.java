import java.util.Scanner;

//code written by Nick TenBrink
//calculate difference between sum of unicode strings. 
public class unicodeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize string sums
		long str1_sum = 0;
		long str2_sum = 0;
		// get user input
		Scanner scnr = new Scanner(System.in);
		System.out.println("enter first string:");
		String str1 = scnr.nextLine();
		System.out.println("enter second string:");
		String str2 = scnr.nextLine();
		// str1 =str1.replaceAll("\\s",""); //remove spaces
		// str2 =str2.replaceAll("\\s","");
		scnr.close();

		// find each char unicode number
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			System.out.println("" + c + ": " + Integer.toString(c));
			str1_sum = str1_sum + Integer.toUnsignedLong(c);
			// System.out.println("sum: "+ str1_sum);
		}
		System.out.println("sum of string 1: " + str1_sum);
		System.out.println("");
		for (int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			System.out.println("" + c + ": " + Integer.toString(c));
			// str2_sum +=
			str2_sum = str2_sum + Integer.toUnsignedLong(c);
			// System.out.println("sum: "+ str2_sum);
		}
		System.out.println("sum of string 2: " + str2_sum);
		System.out.println("");
		// System.out.println("you entered: "+ str1+" "+str2);
		// System.out.println("sum of "+ str1+": "+str1_sum);
		// System.out.println("sum of "+ str2+": "+str2_sum);

		long result = str1_sum - str2_sum;
		System.out.print("The difference between the sum of the unicode value equivalent of the characters in \"" + str1
				+ "\" and \"" + str2 + "\" is: " + java.lang.Math.abs(result));

	}

}
