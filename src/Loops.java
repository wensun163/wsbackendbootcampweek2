/*
 * Backend Bootcamp Week 2 Coding Assignment Q5
 * Author: Wendy Sun
 * Create a new class called Loops. In the main method of this class, create the following
 *  loops with any variables you feel are needed:
 *a.	A while loop that prints all even numbers from 0 to 100
 *b.	A while loop that prints every 3rd number going backwards from 100 until we reach 0
 *c.	A for loop that prints every other number from 1 to 100
 *d.	A for loop that prints every number from 0 to 100, but if the number is divisible by 3,
 * it prints “Hello” instead of the number, and if the number is divisible by 5, 
 * it prints “World” instead of the number, and if it is divisible by both 3 and 5, 
 * it prints “HelloWorld” instead of the number.
 */


public class Loops {

	public static void main(String[] args) {
		//5a. A while loop that prints all even numbers from 0 to 100
		int i=0;
		while (i<=100) {
			System.out.print(i + " ");
			i+=2;
		}//end while
		System.out.println();
		
		//5b. A while loop that prints every 3rd number going backwards from 100 until we reach 0
		int j=100; 
		while (j>=0) {
			System.out.print(j + " ");
			j-=3;			
		}//end while
		System.out.println();//end 5b		
	
		//5c. A for loop that prints every other number from 1 to 100
		for(int k=0; k<100; k++) {
				if (k%2==1) {
				System.out.print(k + " ");		
			}//end if
		}//end for 	

		/*
		 * 5d.	A for loop that prints every number from 0 to 100, 
		 * but if the number is divisible by 3,it prints “Hello” instead of the number,
		 *  and if the number is divisible by 5, it prints “World” instead of the number, 
		 *  and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		 */
		 
		 for (int a=0; a <=100; a++) {
			 if (a%3==0) {
				 System.out.println("Hello");
			 }
			 else if (a%5==0) {
				 System.out.println("World");
			 }
			 else if(a%3==0 && a%5==0) {
				 System.out.println("HelloWorld");
			 }
			 else {
				 System.out.println(a);
			 }//end if
		 }//end for
	}//end main 
	
}//end Loops




	
