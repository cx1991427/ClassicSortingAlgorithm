import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSortRandomPivot {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(new FileReader("hw3.dat"));
		
		int N=scan.nextInt();
		int[] x=new int[N];
		for(int i=0; i<x.length; i++){
			x[i]=scan.nextInt();
		}
		
		System.out.println(Arrays.toString(x));
		 
		int low = 0;
		int high = x.length - 1;

		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
		scan.close();
		
	}
 
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		int middle=low+(int) (Math.random()*(high-low+1));
		int pivot=arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
}