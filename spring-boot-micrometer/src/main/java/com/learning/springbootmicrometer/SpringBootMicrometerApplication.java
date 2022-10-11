package com.learning.springbootmicrometer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMicrometerApplication {

	public static void main(String[] args) {


		//SpringApplication.run(SpringBootMicrometerApplication.class, args);

		String s = "abc";
		printPermutn(s, "");
	}

	static void printPermutn(String str, String ans)
	{

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) +
					str.substring(i + 1);

			// Recursive call
			printPermutn(ros, ans + ch);
		}
	}

}
