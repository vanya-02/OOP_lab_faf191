package com.company;

public class Main {

	public static void main(String[] args) {
		// write your code here
		TextParser textParser = new TextParser();
		String[] a = textParser.readFile();
		String b;
//        int i=0;
//        String a="2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12)";
		for (int i = 0; i < a.length; i++) {
			b = a[i];

			BalancedParan text = new BalancedParan(b);
//        System.out.println(b);
			int j = i + 1;
			if (text.read()) {
				System.out.println("Nr " + j + " : " + b + " Balanced Paranteses Main");
			} else {
				System.out.println("Nr " + j + " : Unbalanced parantases");
			}
//        i++;
		}
	}
}
