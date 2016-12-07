import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ExpressionSolver
{
	
	public static void main(String[]args)
	{
		Scanner user_input = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String expression = user_input.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		doEquation(equation);
	}
	
	public static void doEquation(ArrayList <String> equation)
	{
		
		int i= 0;
		while(i < equation.size())
		{
			if (equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if (equation.get(i).equals("*"))
				{
					equation.set(i,"" + (Integer.parseInt(equation.get(i-1))* (Integer.parseInt(equation.get(i+1)))));
				}
				else
				{
				equation.set(i,"" + (Integer.parseInt(equation.get(i-1))/ (Integer.parseInt(equation.get(i+1)))));	
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			
			else if (equation.get(i).equals("+") || (equation.get(i).equals("-")))
			{
				if (equation.get(i).equals("+"))
					equation.set(i,"" + (Integer.parseInt(equation.get(i-1))+ (Integer.parseInt(equation.get(i+1)))));
				else
				{
					equation.set(i,"" + (Integer.parseInt(equation.get(i-1))- (Integer.parseInt(equation.get(i+1)))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}	
			else
			{
				i++;
			}	
		}	
			
		System.out.println(equation);
	}
	
}