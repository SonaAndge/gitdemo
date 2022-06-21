/*
 * 31.	Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.
Create method members
●	init - to input X and Y from user
●	add - to add X and Y and store in R
●	multiply - to multiply X and Y and store in R
●	power - to calculate X Y and store in R
●	display- to display Result R

 */




package Ass_11;
import java.util.Scanner;

public class AssMathOperation {
	private int x;
	private int y;
	private int R;
	
	public void init()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number ");
		x = s.nextInt();
		System.out.println("Enter second number ");
		y = s.nextInt();
		
	}
	public void add()
	{
		R = x + y;
	}
	public void multiply()
	{
		R = x*y;
	}
	public void power()
	{   R=1;
		while(y!=0)
		{ 
		  R = R*x;
		  y--;
		}
	}
	public void divide()
	{
		 R = x / y;
	}
	public void display()
	{
		System.out.println("The output is "+R);
	}
	public static void main(String[] args)
	{
		AssMathOperation m = new AssMathOperation();
		m.init();
		m.add();
		m.display();
		m.multiply();
		m.display();
		m.power();
		m.display();
		m.divide();
		m.display();
		
	}

}
