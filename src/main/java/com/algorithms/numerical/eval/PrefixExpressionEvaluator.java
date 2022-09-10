package com.algorithms.numerical.eval;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PrefixExpressionEvaluator {


	Stack<Double> operand = new Stack<Double>();
	List<String> operators = Arrays.asList("-","+","/","*","^");


	public static void main(String[] args) {
		InfixToPrefix in = new InfixToPrefix();

		PrefixExpressionEvaluator pre  = new PrefixExpressionEvaluator();
		System.out.println(pre.evaluate(in.convert("10*2+3")));
		System.out.println(pre.evaluate(in.convert("10*(2+3)")));
		System.out.println(pre.evaluate(in.convert("10+20*3-5.6*4"))); 

	}

	public double evaluate(String expression) {
		String[] expr =  expression.split("\\s+"); 
		for(int i = expr.length -1; i >=0 ;i++) {
			if(operators.contains(expr[i])) {
				double op1 = operand.pop();
				double op2 = operand.pop();
				operand.push(binaryOperator(op1, op2, expr[i]));
			} else {
				operand.push(Double.parseDouble(expr[i]));
			}
		}

		return operand.pop();
	}



	public double binaryOperator(double op1, double op2, String operand) {
		switch (operand) {
		case "+":
			return op1 + op2;
		case "-":
			return op1 - op2;
		case "/":
			return op1 / op2;
		case "*":
			return op1 * op2;
		default:
			return 0;

		}
	}
}
