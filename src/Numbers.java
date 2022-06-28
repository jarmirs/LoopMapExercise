import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*Loop and Map.Entry Exercises

Write a program that does the following:
Asks the user for 5 numbers
Stores them in an array list
Finds the sum, product, largest, and smallest of those numbers

*/

public class Numbers {
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
//	prompt to ask for 5 numbers
	System.out.println("Enter a number, please:");
Integer firstNumber= input.nextInt();
//test see if user input value store to the variable
System.out.println(firstNumber);
System.out.println("Enter a number, please:");
Integer secondNumber= input.nextInt();
System.out.println("Enter a number, please:");
Integer thirdNumber= input.nextInt();
System.out.println("Enter a number, please:");
Integer fourthNumber= input.nextInt();
System.out.println("Enter a number, please:");
Integer fifthNumber= input.nextInt();
//		array list of numbers
ArrayList<Integer>numList = new ArrayList<Integer>((
Arrays.asList(firstNumber, secondNumber, thirdNumber,fourthNumber, fifthNumber)		));
System.out.println(numList);
// est variables to store sum, product, lgst #, smallest #
Integer sum=0;
Integer product=1;
Integer largeNum=numList.get(0);
Integer smallNum=numList.get(0);
//	for loop interate over array
for (Integer num:numList){
	System.out.println(num);
	
	sum=sum +num;
	product=product +num;
	if(num>largeNum) {
		largeNum=num;
	}
if (num<smallNum) {
	smallNum=num;
}
	}
System.out.printf("The sum is: %d\n", sum);
System.out.printf("The product is: %d\n", product);
System.out.printf("The largest number is: %d\n", largeNum);
System.out.printf("The smallest number is: %d\n", smallNum);

	}
}