/**
 * Filename: TestRational.java
 * 
 * Author: Edwin Y. Melendez Lopez #89139
 * 
 * Description: Java Program that takes two fraction or rational numbers and performs some of the methods
 * 				like Add, Subtract, Multiply and Divide and simplifies using the Greatest Common Divider formula.
 * 
 * 			History:
 * 			01/21/2018 - Created Program. EML
 *  		01/21/2018 - Created Class Rational. EML
 * 			01/21/2018 - Created Setters and getters. EML
 * 			01/21/2018 - Started working on the logic steps of a fraction. EML
 * 			01/22/2018 - Started working on the methods. EML
 * 			01/22/2018 - Added Add Method. EML
 * 			01/22/2018 - Added Subtraction Method. EML
 * 			01/22/2018 - Added the askUser Method. EML
 * 			01/23/2018 - Added the GDC Method. EML
 * 			01/24/2018 - Added the Simplify Method. EML
 * 			01/24/2018 - Fixed some errors. EML
 * 			01/25/2018 - Tested the Add, Subtracts, Multiply and Divide Methods. Works Perfectly. EML
 * 			01/25/2018 - Main Program methods runs smooth, now to add the specifics exceptions. EML
 * 			01/26/2018 - Exception added. Began tests. EML
 * 			01/26/2018 - Started the Documentation. EML
 * 			01/27/2018 - Tested Program and documentation complete. EML
 */


package edu.pupr.Rational;

public class TestRational {

	public static void main(String[] args)
	{
	
		Rational myRational = new Rational();
		
		myRational.askUser();

	}

}

/* Output:

Welcome to the Rational Java Program! 

IMPORTANT! All values will be display in simplified form. If you want the original values,
you need to multiply by the number specified in the GDC.


Enter the numerator of the first fraction: 
5
Enter the denominator of the first fraction: 
9
Enter the numerator of the second fraction: 
10
Enter the denominator of the second fraction: 
80


SUM: (5 / 9) + (10 / 80) = (409 / 72)

SUBTRACTION: (5 / 9) - (10 / 80) = (391 / 72)

MULTIPLY: (5 / 9) * (10 / 80) = (5 / 72)

DIVISION: (5 / 9) / (10 / 80) = (40 / 9)

The Fraction (10 / 80) can be simplified to (1 / 8) using the GDC 10.

DISPLAY FRACTION: 5 / 9

DISPLAY DECIMAL OF FRACTION: 5 / 9 = 0.5555555555555556
*/