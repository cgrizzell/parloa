import java.util.Scanner;
import java.util.*;
import java.util.regex.*;  

public class Account {

	public static String inputVal(String s) { //method that validates user's input

		//first convert string to uppercase and remove white space
		String a = s.toUpperCase();
		a = a.replaceAll(" ", "");


		//check PA-0000000 format
		if ((Pattern.matches("(PA-)(\\d)(\\d)(\\d)(\\d)(\\d)(\\d)(\\d)", a)) == true)

			System.out.println(a);

		//if PA-0000000 format but missing the "-"
		else if ((Pattern.matches("PA\\d{7}", a) == true)) {

			//add "-"
			StringBuffer ab = new StringBuffer(a);
			ab.insert(2,"-");
			System.out.println(ab);

		}

		//if PA-0000000 format but has 'minus' instead of "-"
		else if ((Pattern.matches("(PAMINUS)(\\d)(\\d)(\\d)(\\d)(\\d)(\\d)(\\d)", a)) == true) {

			//delete 'minus' and add "-"
			StringBuffer ab = new StringBuffer(a);
			ab.delete(2,7);
			ab.insert(2,"-");
			System.out.println(ab);

		}

		//check 000000-A0 format
		else if ((Pattern.matches("(\\d)(\\d)(\\d)(\\d)(\\d)(\\d)(-A)(\\d)", a)) == true)

			System.out.println(a);

		//if 000000-A0 format but missing the "-"
		else if ((Pattern.matches("(\\d)(\\d)(\\d)(\\d)(\\d)(\\d)(A)(\\d)", a)) == true) {

			//add "-"
			StringBuffer ab = new StringBuffer(a);
			ab.insert(6,"-");
			System.out.println(ab);
		}

		//if 000000-A0 format but has 'minus' instead of "-"
		else if ((Pattern.matches("(\\d)(\\d)(\\d)(\\d)(\\d)(\\d)(MINUSA)(\\d)", a)) == true) {

			//delete 'minus' and add "-"
			StringBuffer ab = new StringBuffer(a);
			ab.delete(6,11);
			ab.insert(6,"-");
			System.out.println(ab);
		}

		//if wrong format print empty string
		else

			System.out.println(" ");

	return null;

	}


public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your account number...");
		String accnt_num = s.nextLine();

		Account client1 = new Account();
		client1.inputVal(accnt_num);

	}
}
