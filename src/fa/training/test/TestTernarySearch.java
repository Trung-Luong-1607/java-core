package fa.training.test;

public class TestTernarySearch {
	public static int TernarySearch(int arr[], int x) {
		int left = 0;
		int right = arr.length - 1;
		
		while (right - left >= 0) {
			int mid1 = left + (right - left) / 3;
			int mid2 = right - (right - left) / 3;
			
			if (x == arr[mid1]) {
				return mid1;
			} else if (x == arr[mid2]) {
				return mid2;
			} else if (x < arr[mid1]) {
				right = mid1 - 1;
			} else if (x > arr[mid2]) {
				left = mid2 + 1;
			} else {
				left = mid1 + 1;
				right = mid2 - 1;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(TernarySearch(arr, 8));
	}
}
