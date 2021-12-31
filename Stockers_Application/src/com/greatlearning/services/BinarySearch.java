package com.greatlearning.services;

public class BinarySearch {
	public int binSearch(double[] arr, double num, int left, int right) {
		int mid = left + (right - left)/2;
		while(left<=right) {
			if(arr[mid] == num) {
				return mid;
			}
			else if(arr[mid] > num) {
				right = mid - 1;
			}
			else if(arr[mid] < num) {
				left = mid + 1;
			}
			mid = left + (right - left)/2;
		}
		return -1;
	}
}
