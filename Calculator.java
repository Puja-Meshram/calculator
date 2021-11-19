package Math_operation;

import java.util.Scanner;

public class Calculator
{
	// Creation of Arithmetic functions...//
	
	void Addition(int a , int b)
	{
		System.out.println("Addition is: "+ (a+b));
	}
	
	void Subtraction(int a, int b)
	{
		System.out.println("Subtraction is: "+ (a-b));
	}
	
	void Multiplication(int a, int b)
	{
		System.out.println("Multiplicatio is: "+ (a*b));
	}
	
	void Division(int a, int b)
	{
		System.out.println("Division is: "+ (a/b));
	}
	
	double area_of_circle(int radius)
	{
		double ans = 3.14*radius*radius;
		
		return ans;
	}
	
	

	public static void main(String[] args) 
	
	{
		Calculator c = new Calculator(); // creating object of Calculator class....//
		Scanner scan = new Scanner(System.in); // taking user input through keyboard...//
		
		System.out.println("Enter number 1: ");
		int a = scan.nextInt(); // taking value for a.....//
		
		System.out.println("Enter number 2: ");
		int b = scan.nextInt(); // tacking value for b....//
		
		c.Addition(a,b);     // calling Addition function body...//
		c.Subtraction(a,b);  // calling Subtraction function body...//
		c.Multiplication(a,b);  // calling Multiplication function body..//
		c.Division(a,b);      // calling Division function body...//
		
		double ans = c.area_of_circle(100);  // Calling area_of_circle function...//
		
		System.out.println("Area of circle is: " +ans);    // Printing result of area_of _circle function which is return to main(
		
	}

}
