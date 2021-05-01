package Recursion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		// Calculate Factorial
		System.out.println("Enter a number to calculate it's factorial: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int f = calcFact(num);
		System.out.println("Your factorial value of " + num + " is: " + f);
		
		// Find out Palindrome
		System.out.println("Enter a String to check if it is a Palindrome: ");
		Scanner inPal = new Scanner(System.in);
		String str = inPal.nextLine();
		if(isPalindrome(str))
			System.out.println(str + " is a Palindrome");
		else 
			System.out.println(str + " is not a Palindrome");
		
		// Find out Fibonacci Sequence
		System.out.println("Fibonacci Numbers: ");
		for(int i = 0; i <= 20; i++) {
			System.out.println((i + 1) + ": " + fib(i) + ", ");
		}
		
		
		in.close();
		inPal.close();
	}

	private static int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		//recursive formula
		return fib(n - 1) + fib(n - 2);
	}

	private static boolean isPalindrome(String s) {
		
		s = s.replaceAll("[^a-zA-Z0-9_-]", "");
		char first = Character.toLowerCase(s.charAt(0));
		char last = Character.toLowerCase(s.charAt(s.length() - 1));
		
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (first == last) {
			return isPalindrome(s.substring(1,s.length() - 1));
		}
		
		return false;
	}

	private static int calcFact(int n) {
		System.out.println("Entering calcFact with n = " + n);
		if (n <= 1) // Base case
			return 1;
		else 
			return n* calcFact(n - 1);
	}
	
	public static void myPrint(int n) 
	{
	   if (n < 10)
	   {
	      System.out.print(n);
	   }
	   else 
	   {
	      int m = n % 10;
	      System.out.print(m);
	      myPrint(n / 10);
	   }
	}
	

}
