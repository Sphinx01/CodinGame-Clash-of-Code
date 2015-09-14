package com.codingame.reversecase;

import java.util.Scanner;

public class Reverse_case {
	
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		String word = in.nextLine(), res="";
		
		for(int i=0;i<word.length();i++){
			String h=""+word.charAt(i);
			if(isUpperCase(word.charAt(i)))
				res+=h.toLowerCase();
			else
				res+=h.toUpperCase();
		}
		System.out.println(res);
	}
	public static boolean isUpperCase(char c){
		if(c<='z' && c>='a')
			return false;
		return true;
	}
}
