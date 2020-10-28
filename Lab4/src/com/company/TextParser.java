package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class TextParser {
	String data;

	public String[] readFile() {

		ArrayList<String> dataArray = new ArrayList<>();
		try {
			File filetext = new File("three_expressions.txt");
			Scanner textReader = new Scanner(filetext);
			int i = 0;
			while (textReader.hasNextLine()) {
				data = textReader.nextLine();
				dataArray.add(data);
//                System.out.println(data+"Text parser");

			}
			textReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred with file in text parser .");
			e.printStackTrace();
		}
		String[] s = new String[100];
		for (int i = 0; i < dataArray.size(); i++) {
			s[i] = dataArray.get(i);
		}
		return dataArray.toArray(new String[0]);
	}
}