package com.epam.design_principle;

public class Math_class {
	public static double Operand1;
	public static double Operand2;
	public static char Operator;
	public static void Calculate() {
		double result=Double.NaN;
		switch(Operator) {
		case '+' :
			result=Operand1+Operand2;
			break;
		case '-' :
			result=Operand1-Operand2;
			break;
		case '*':
			result=Operand1*Operand2;
			break;
		case '/':
			result=Operand1/Operand2;
			break;
		default:
			System.out.println("Invalid Operator "+Operator);
		}
		System.out.println(result);
	}
}
