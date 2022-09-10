package com.algorithms.numerical.eval;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PostfixExpressionEvaluator {

	Stack<Double> operand = new Stack<Double>();
	List<String> operators = Arrays.asList("-","+","/","*","^");


	public static void main(String[] args) {
		InfixToPostfix in = new InfixToPostfix();

		PostfixExpressionEvaluator pre  = new PostfixExpressionEvaluator();
		System.out.println(pre.evaluate(in.convert("10*2+3")));
		System.out.println(pre.evaluate(in.convert("10*(2+3)")));
		System.out.println(pre.evaluate(in.convert("10+20*3-5.6*4"))); 

	}

	public double evaluate(String expression) {
		for(String str : expression.split("\\s+")) {
			if(operators.contains(str)) {
				double op2 = operand.pop();
				double op1 = operand.pop();
				operand.push(binaryOperator(op1, op2, str));
			} else {
				operand.push(Double.parseDouble(str));
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
