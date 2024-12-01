package com.exam;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PostOrder {
	public static void main(String[] args) throws IOException {
		var reader = new Scanner(System.in);
		while(reader.hasNext()) {
			
		}


		reader.close();
	}
	
	public int[] traverse() {
		int[] fixedArray = new int[3];
		Arrays.asList(fixedArray).add(traverse());
		return fixedArray;
	}

}
