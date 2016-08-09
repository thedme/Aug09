package com.finalbatting;

import java.util.Scanner;

public class BatterCalculator
{
	
	//do math on floats only. 
	
	float totalBases = 0.0f;
	float sluggingAvg = 0.0f;
	float battingAvg=0.0f;
	public static void main(String[] args) {
		System.out.println("Please enter the number of total hits.");
		Scanner Batter = new Scanner(System.in);
		float totalHits = Batter.nextFloat();
		
		System.out.println("Please enter the number of at bats.");
		Scanner sc = new Scanner(System.in);
		float atBats = sc.nextFloat();
		if(atBats <= 0.0f)
		{
			System.err.println(" Please enter a value greater than 0 ");
			System.exit(0);
		}
		
		BatterCalculator orioles = new BatterCalculator();
		
		System.out.println("Please enter the total bases. ");
		Scanner sc1 = new Scanner(System.in);
		float totalBases = sc1.nextFloat();
				
				
			//orioles.calculateBattingAverage(totalHits, atBats);
			//System.out.println("This is your batting percentage");
			//System.out.println(orioles.calculateBattingAverage(totalHits, atBats));
			
			orioles.calculateBattingAverage(totalHits, atBats);
			System.out.print("%");
			
			//orioles.calculateBattingAverage(totalHits, atBats);
			System.out.println("");
			//System.out.println("This is your slugging average");
			orioles.calculateSluggingAvg(totalBases, atBats);
			System.out.print("%");
	}
	
	public void calculateBattingAverage(float totalHits, float atBats){
		
		battingAvg = (totalHits/atBats) * 100;
		System.out.printf("Your batting average is  %.3f" , battingAvg);
		
		//return battingAvg;
		
		
	}
	public void calculateSluggingAvg(float totalBases, float atBats)
	{
		
		sluggingAvg = (totalBases/atBats) * 100;
		System.out.printf("Your slugging average is %.3f" , sluggingAvg);
		
		//return sluggingAvg;
	}

}