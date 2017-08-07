package com.sbbi.obesity.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParseUSDADatabase {

	private static final int NAME = 1;
	private static final int ENERGY = 3;
	private static final int PROTEIN = 4;
	private static final int LIPID = 5;
	private static final int CARBS = 7;
	private static final int FIBER = 8;
	private static final int SUGAR = 9;
	private static final int FAT_SAT = 44;
	private static final int FAT_MONO = 45;
	private static final int FAT_POLY = 46;
	private static final int CHOLESTEROL = 47;
	
	public static void main(String[] args) {
		
		String location = "/Users/bruno/Desktop/newFood";
		
		try (BufferedReader br = new BufferedReader(new FileReader(location))) {

			String sCurrentLine;
			
			while ((sCurrentLine = br.readLine()) != null) {
				String food[] = sCurrentLine.split("\t");
				System.out.println(food[1]);
				System.out.println(food[3]);
				System.out.println(food[4]);
				System.out.println(food[5]);
				System.out.println(food[7]);
				System.out.println(food[8]);
				System.out.println(food[9]);
				System.out.println(food[44]);
				System.out.println(food[45]);
				System.out.println(food[46]);
				System.out.println(food[47]);
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
}
