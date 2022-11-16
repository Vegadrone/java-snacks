package org.generation.italy;

public class JavaSnacks6 {
	public static void main(String[] args) {
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		int[] arr3 = new int [arr1.length];
		
		int avg = 0;
		
		int sum = 0;
		
		for (int i = 0; i < arr3.length; i++) {
			
			arr3[i] = arr1[i] + arr2[i];
			
			sum += arr3[i];
			
			int arrLnSum = arr1.length + arr2.length;
			avg = sum / arrLnSum;
			
			System.out.println(arr3[i]);
			System.out.println(sum);
			System.out.println(avg);
		}
		
		int minArr1 = arr1[0];
		int minArr2 = arr2[0];
		int maxArr1 = arr1[0];
		int maxArr2 = arr2[0];
		
		
		for (int i = 0; i < arr1.length; i++) {
		
			if (arr1[i] > maxArr1) {
				maxArr1 = arr1[i];
			} 
		
			else if (arr1[i] < minArr1) {
				minArr1 = arr1[i];
			}
		}
		
		System.out.println(minArr1);
		System.out.println(maxArr1);
		
		for (int i = 0; i < arr2.length; i++) {
			
			if (arr2[i] > maxArr2) {
				maxArr2 = arr2[i];
			} 
		
			else if (arr2[i] < minArr2) {
				minArr2 = arr2[i];
			}
		}
		
		System.out.println(minArr2);
		System.out.println(maxArr2);
	}
}
