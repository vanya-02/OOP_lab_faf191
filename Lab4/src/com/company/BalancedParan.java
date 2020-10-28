package com.company;

import java.util.Stack;

public class BalancedParan {
	String a, b;

	public BalancedParan(String text) {
		a = text;
	}

	Stack<Character> stk = new Stack<>();
	//    String a = "[(())]";
	static boolean b1;

	public boolean read() {
		if (a == null) {
			System.out.println("The String in Paranthese checker is null");
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '(' || a.charAt(i) == '[' || a.charAt(i) == '{' || a.charAt(i) == '<') {

				stk.push(a.charAt(i));

			} else if (a.charAt(i) == ')' || a.charAt(i) == ']' || a.charAt(i) == '}' || a.charAt(i) == '>') {
				if (stk.isEmpty()) {
//                    System.out.println("Remains some unclosed paraathesed");
					return false;
				}
				char c;
				switch (a.charAt(i)) {
					case ')': {
						c = stk.pop();
						if (c == '[' || c == '{' || c == '<')
							return false;
					}
					case ']': {
						c = stk.pop();
						if (c == '(' || c == '{' || c == '<')
							return false;
					}
					case '}': {
						c = stk.pop();
						if (c == '(' || c == '[' || c == '<')
							return false;
					}
					case '>': {
						c = stk.pop();
						if (c == '(' || c == '[' || c == '{')
							return false;
					}
				}
			}
		}
		return (stk.isEmpty());
	}
}