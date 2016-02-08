import java.io.FileReader;
import java.util.Scanner;

public class InsertionSort {
		 
	    public static void main(String[] args) throws Exception{
//	        int[] arr1 = {100,30,20,50,70,60,80,40};
	        Scanner scan=new Scanner(new FileReader("hw3.dat"));
	        int N=scan.nextInt();
	        int[] arr2=new int[N];
	        for(int i=0; i<arr2.length; i++){
	        	arr2[i]=scan.nextInt();
	        }
	        insertionSort(arr2);
	        for(int x:arr2){
	            System.out.print(x+" ");
	        }
	    }
	     
	    public static void insertionSort(int[] arr){
	        int temp;
	        for (int i = 1; i < arr.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(arr[j] < arr[j-1]){
	                    temp = arr[j];
	                    arr[j] = arr[j-1];
	                    arr[j-1] = temp;
	                }
	            }
	        }
	    }
}
