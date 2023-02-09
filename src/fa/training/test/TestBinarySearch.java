package fa.training.test;

public class TestBinarySearch {
	public static int binarySearch(int arr[], int x) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("The position of the element to look for is " + binarySearch(arr, 11));
	}
}
