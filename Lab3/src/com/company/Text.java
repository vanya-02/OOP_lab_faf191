package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Text {
	private String input;

	public Text(String txt) {
		this.input = txt;
	}

	//  prints Number of sentences and words
	public void info() {
		int w_count = 0;
		int letters = 0;
		int vowels = 0;
		int consonants = 0;
		int sentences = input.split("[\\.\\?!]").length;
		char ch[] = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			ch[i] = input.charAt(i);
			if ((i > 0 && ch[i] != ' ' && ch[i - 1] == ' ') || (ch[0] != ' ' && i == 0)) {
				w_count++;
			}
			if (Character.isLetter(ch[i])) {
				letters++;
				if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
					vowels++;
				}
				else {
					consonants++;
				}
			}
		}
		System.out.println("String contains " + sentences + " senteces, " + w_count + " words, " + letters + " letters, " + vowels + " vowels and " + consonants + " consonants.");
	}

	// prints Top5 words and longest word
	public void top() {
		input = input.toLowerCase();
		input = input.replaceAll("\\.|,|\\?|\\!", "\0");
		String[] words = input.split("\\s");	// contains all the words

		Map<String, Integer> hsmap = new HashMap<String, Integer>(); // words + nr_of_occurences
		for (String str : words) {
			if (hsmap.keySet().contains(str)) {
				hsmap.put(str, hsmap.get(str) + 1);
			}
			else {
				hsmap.put(str, 1);
			}
		}

		Set<String> WORDS = hsmap.keySet();
		List<String> wordsSorted = WORDS.stream().collect(Collectors.toList());

//		Collections.sort(wordsSorted, Comparator.comparingInt(s -> wordFreq.getOrDefault(s, 0)));

		Collections.reverse(wordsSorted);

		System.out.println("Top 5 most popular words:");
		for(int i = 0; i < 5; i++)
			System.out.println(wordsSorted.get(i));




	}

}
//
//
//	Set<String> words = wordLen.keySet();
//	List<String> wordsSorted = words.stream().collect(Collectors.toList());
//	Collections.sort(wordsSorted, Comparator.comparingInt(s -> wordFreq.getOrDefault(s, 0)));
//	Collections.reverse(wordsSorted);
//	System.out.println("Top " + x + " most popular words:");
//		for(int i = 0; i < x; i++)
//			System.out.println(wordsSorted.get(i) + " " + wordFreq.get(wordsSorted.get(i)) + " times");
//
