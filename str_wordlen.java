//Given a string s consisting of words and spaces, return the length of the last word in the string.

import java.util.*;
public class str_wordlen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = 0;
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ')
				len = 0;
			else
				len++;
		}
		System.out.println(len);
	}
}