package org.generation.italy;

public class JavaSnacks5 {
	public static void main(String[] args) {
		
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		int sum = 0;
		int avg = 0;
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			} 
			
			else if (arr[i] < min) {
				min = arr[i];
			}
			
			sum += arr[i];
			avg = sum / arr.length;
			
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
		System.out.println(avg);
	}
}
