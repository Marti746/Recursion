package Recursion;

public class RecursePractice {
	   public static void main(String[] args) { 
	      recurse(3); 
	      System.out.println(newCalc(15));
	      System.out.println(square(7));
	   }
	 
	   public static int recurse(int n) {     
	      int total = 0;
	      if (n == 0)  
	      {
	         return 0;
	      }
	      else    
	      { 
	         total = 3 + recurse(n - 1);
	      }

	      System.out.println(total);     
	      return total;     
	   } 
	   
	   public static int newCalc(int n) {
	      if (n < 0)
	      {
	         return -1;
	      }
	      else if (n < 10)
	      {
	         return n;
	      }
	      else
	      {
	         //return (n % 10) + newCalc(n / 10);
	    	  return (1 + newCalc(n / 10));
	      }
	   }
	   
	   public static double minVal(double[] elements, int index) 
	   {    
	      if (index == elements.length - 1) 
	      {
	         return elements[index];   
	      }
	      double val = minVal(elements, index + 1);
	      
	      if (elements[index] < val) 
	      {
	         return elements[index];   
	      }
	      else     
	      {
	         return val; 
	      }
	   }
	   
	   public static int square(int n) {
	      return squareHelper(n, n);
	   }
	    
	   public static int squareHelper(int c, int n) {
	      if (c == 1) {
	         return n;
	      }
	      else 
	      {
	         //return n + squareHelper(c - 1, n);
	    	  return squareHelper(c - 1, n);
	      }
	   }
	   
//		if (word.length() <= 1)
//		return word;
//	else
//		return word.charAt(word.length() - 1) + printBackward(word)
	   
}
