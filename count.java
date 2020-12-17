package com.craig_kraemer_day1.count;

	import java.util.Scanner;

	public class Count {

		public static void main(String[] args) {
			
			float num = (float) .1;					
			float count = 0;
			float countP = 0;
			float countN = 0;
			float total = (float) .1;
			float totalP = 0;
			float totalN = 0;
			float average = 0;		
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter your numbers, when you are finished enter 0: ");
			
			while (num > 0) {
				num = s.nextFloat();
				countP++;
				totalP += num;
			
			while (num < 0) {
					num  = s.nextFloat();
					countN++;
					totalN += num;
				}
			}
			
			countP = countP - 1;
			count = countP + countN;
			total = totalP + totalN;
			average = total / count;
			
			if (num == 0) {
				System.out.println("Here are your results:");
				System.out.println();
			}
			
			s.close();
			
			System.out.println("The number of positives is " + countP);
			System.out.println("The number of negatives is " + countN);
			System.out.println("The total is " + total);
			System.out.println("The average is " + average);
			
		}	
		}