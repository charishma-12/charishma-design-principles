package com.epam.design_principle;
import java.util.*;
import java.io.*;
public class Calc_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter operands and operator");
		double a=in.nextDouble();
		//in.next();
		char c=in.next().charAt(0);
		double b=in.nextDouble();
		Math_class.Operand1=a;
		Math_class.Operator=c;
		Math_class.Operand2=b;
		Math_class.Calculate();
	}

}
