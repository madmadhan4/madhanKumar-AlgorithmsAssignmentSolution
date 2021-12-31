package com.greatlearning.appmain;
import java.util.Scanner;

import com.greatlearning.services.MergeSort;
import com.greatlearning.services.BinarySearch;
import com.greatlearning.services.StockCheck;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MergeSort mergesort = new MergeSort();
		BinarySearch bSearch = new BinarySearch();
		StockCheck stockcheck = new StockCheck();
		System.out.println("Enter the no of companies ");
		int size = sc.nextInt();
		int option;
		double arr[] = new double[size]; //Array Declaration
		boolean boolArr[] = new boolean[size];
		for(int i = 0; i<size; i++) {
			int temp = i + 1;
			System.out.println("Enter current stock price of the company " + temp);
			arr[i] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday? ");
			boolArr[i] = sc.nextBoolean();
		}
		do {
			System.out.println("--------------------------------------------------------------------------- ");
			System.out.println("Enter the operation that you want to perform ");
			System.out.println("1. Display the companies stock prices in ascending order ");
			System.out.println("2. Display the companies stock prices in descending order ");
			System.out.println("3. Display the total no of companies for which stock prices rose today ");
			System.out.println("4. Display the total no of companies for which stock prices declined today ");
			System.out.println("5. Search a specific stock price ");
			System.out.println("6. Press 0 to exit ");
			System.out.println("--------------------------------------------------------------------------- ");
			option = sc.nextInt();
			if(option == 1) {
				//Sort and Display the array in Ascending order
				mergesort.mergeSort(arr, 0, arr.length - 1, "ASC");//Sort the array in Ascending Order
				System.out.println("Stock prices in ascending order are : ");
				display(arr); //Display the array

			}
			else if(option == 2){
				//Sort and Display the array in Descending order
				mergesort.mergeSort(arr, 0, arr.length - 1, "DEC");//Sort the array in Descending order
				System.out.println("Stock prices in descending order are : ");
				display(arr); //Display the array
			}
			else if(option == 3){
				int val = stockcheck.stockCheck(boolArr, true);
				System.out.println("Total no of companies whose stock price rose today : " + val);
			}
			else if(option == 4){
				int val = stockcheck.stockCheck(boolArr, false);
				System.out.println("Total no of companies whose stock price declined today : " + val);
			}
			else if(option == 5){
				System.out.println("Enter the key value ");
				double key = sc.nextDouble();
				//Sort the array in ascending order before calling BINARY SEARCH
				mergesort.mergeSort(arr, 0, arr.length - 1, "ASC");
				int index = bSearch.binSearch(arr, key, 0, arr.length);
				if(index == -1) {
					System.out.println("Value not found ");
				}
				else {
					System.out.println("Stock of value " + key + " is present");
				}
			}
			else if(option == 0){
				System.out.println("Exited successfully ");
				break;
			}
			else {
				System.out.println("Select a valid option! ");
			}
		}while(option!= 0);
		sc.close();
			
	}

	private static void display(double[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


}
