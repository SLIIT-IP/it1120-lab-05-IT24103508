import java.util.Scanner;
public class IT24103508Lab5Q1{
public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	int number1,number2,number3,min,max;

	System.out.print("Enter the first integer:");
	number1=input.nextInt();
	System.out.print("Enter the second integer:");
	number2=input.nextInt();
	System.out.print("Enter the third integer:");
	number3=input.nextInt();

	System.out.print("User entered numbers are: "+number1);
	System.out.print(" "+number2);
	System.out.print(" "+number3+"\n");

	if (number1>number2){
		max=number1;
		min=number2;}
	else{
		max=number2;
		min=number1;}

	if (number3>max){
		max=number3;}
	if(number3<min){
		min=number3;}

	System.out.println("The Highest number is:"+max);
	System.out.println("The Lowest number is:"+min);
		
	}
}