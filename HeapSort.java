import java.io.FileReader;
import java.util.Scanner;

public class HeapSort {  
  
    public static void main(String[] args) throws Exception {  
    	Scanner scan =new Scanner(new FileReader("hw3.dat"));
    	int N=scan.nextInt();
    	int[] arr=new int[N];
    	for(int i=0; i<arr.length; i++){
    		arr[i]=scan.nextInt();
    	}
        // HeapSort
        heapSort(arr);  
  
        System.out.println("The result after sorting£º");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        scan.close();
    }  
  
    /** 
     * HeapSort 
     */  
    private static void heapSort(int[] arr) {   
        // Transfer array to MaxHeap 
        for (int i = arr.length/2-1; i >= 0; i--){   
            maxHeap(arr, i, arr.length);            
        }  
          
//
        for (int i = arr.length - 1; i > 0; i--) {   
            swap(arr, 0, i); // 
            maxHeap(arr, 0, i); // 
        }  
    }  
  

    private static void maxHeap(int[] arr, int i, int n) {  
        int child_Index;  
        int father;   
        for (father = arr[i]; leftChild(i) < n; i = child_Index) {  //leftChild(i)<=n-1;
            child_Index = leftChild(i);  
              
//          
            if (child_Index != n - 1 && arr[child_Index] < arr[child_Index + 1]) {  //if( child<(n-1) && (arr[child]<arr[child+1]) )
                child_Index++; // 
            }  
              
            // 
            if (father < arr[child_Index]) {  
                arr[i] = arr[child_Index];  //not arr[i]=arr[child_Index];
            }
            else {  
                break; //  
            }  
        }  
        arr[i] = father;  
    }  
  
    // 
    private static int leftChild(int i) {  
        return 2 * i + 1;  
    }  
      
    // 
    private static void swap(int[] arr, int index1, int index2) {  
        int tmp = arr[index1];  
        arr[index1] = arr[index2];  
        arr[index2] = tmp;  
    }  
}  