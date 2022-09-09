package com.algorithms.numerical.eval;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class InfixToPostfix {


	public static void main(String[] args) {
		InfixToPostfix in = new InfixToPostfix();
		System.out.println(in.convert("A+B*C-D*E"));
		System.out.println(in.convert("A*B+C"));
		System.out.println(in.convert("A*(B+C)"));

	}

	List<Character> operators = Arrays.asList('-','+','/','*','^');
	Stack<Character> operatorStack = new Stack<Character>();

	public String  convert(String infixExpression) {
		StringBuilder postFixBuilder = new StringBuilder();

		for(char c : infixExpression.toCharArray()) {
			if(operators.contains(c)) {
				postFixBuilder.append(" ");
				while(!operatorStack.isEmpty() && !isOpeningPra(operatorStack.peek()) && isHigherPrecedence(c)) {
					postFixBuilder.append(operatorStack.pop());
					postFixBuilder.append(" ");
				}
				operatorStack.push(c);
			} else if(c == '(') { 
				operatorStack.push(c);
			} else if(c == ')') { 
				while(!operatorStack.isEmpty() && !isOpeningPra(operatorStack.peek())) {
					postFixBuilder.append(" ");
					postFixBuilder.append(operatorStack.pop());
				}
				operatorStack.pop();
			} else {
				postFixBuilder.append(c);
			}
		}

		while(!operatorStack.isEmpty() && !isOpeningPra(operatorStack.peek())) {
			postFixBuilder.append(" ");
			postFixBuilder.append(operatorStack.pop());
		}

		return postFixBuilder.toString();
	}

	private boolean isHigherPrecedence(char c) {
		return operators.indexOf(operatorStack.peek()) > operators.indexOf(c);
	}

	private boolean isOpeningPra(char c) {
		return c == '(';
	}
}
