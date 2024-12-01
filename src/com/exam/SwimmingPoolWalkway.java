package com.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SwimmingPoolWalkway {

	public static void main(String[] args) throws IOException {
		var reader = new Scanner(System.in);
		
		/*
		 * A = L * W
		 * A = (2x +a)*(2x+b)
		 * A-ab = 4x^2 +2ax + 2bx
		 * 0 = 4x^2 + 4(ab)x -(A-ab)
		 */
		while(reader.hasNext()) {
			int length = reader.nextInt();
			int width =  reader.nextInt();
			int area = reader.nextInt();
			int remainingArea = area - (length*width);
			float value;
			int a =  2;
			int b = (length+ width);
			int c = -remainingArea;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			value = (float) (-b + Math.sqrt(b*b-(2*a*c))/4*a);
			System.out.println(value);
		}


		reader.close();
	}

}
