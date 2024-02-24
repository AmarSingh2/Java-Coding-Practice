package com.selenium.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequencyINString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Counting frequency of each character
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) { // Consider only alphabets
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Displaying frequency of each character
        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
