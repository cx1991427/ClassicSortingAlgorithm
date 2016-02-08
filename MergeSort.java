import java.util.Arrays;

    public class MergeSort {  
       
        public static int[] sort(int[] array, int low, int high,int[] temp) {  
             
            int mid = (low + high) / 2;  
            if (low < high) {  
                // 左边  
                sort(array, low, mid,temp);  
                // 右边  
                sort(array, mid + 1, high,temp);  
                // 左右归并  
                merge(array, low, mid, high,temp);  
            }  
            return array;  
        }  
       
        public static void merge(int[] array, int first, int mid, int last,int[] temp) {  
         
            int i = first, j = mid + 1;  
            int m = mid,   n = last;  
            int k = 0;  
            // 把较小的数先移到新数组中  
            while (i <= m && j <= n)  
            {  
                if (array[i] <= array[j])  
                    temp[k++] = array[i++];  
                else  
                    temp[k++] = array[j++];  
            }  
            // 把左边剩余的数移入数组   
            while (i <= m)  
                temp[k++] = array[i++];  
            // 把右边边剩余的数移入数组    
            while (j <= n)  
                temp[k++] = array[j++];  
             // 把临时数组中的数覆盖array数组      
            for (i = 0; i < k; i++)  
                array[first + i] = temp[i];  
        }  
       
           
        // 归并排序的实现  
        public static void main(String[] args) {  
       
            int[] array = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };  
            int[] temp=new int[array.length];
            MergeSort.sort(array, 0, array.length-1,temp);  
            System.out.println(Arrays.toString(array));  
        }  
    }