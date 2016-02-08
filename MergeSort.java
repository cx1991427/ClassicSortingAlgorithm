import java.util.Arrays;

    public class MergeSort {  
       
        public static int[] sort(int[] array, int low, int high,int[] temp) {  
             
            int mid = (low + high) / 2;  
            if (low < high) {  
                // ���  
                sort(array, low, mid,temp);  
                // �ұ�  
                sort(array, mid + 1, high,temp);  
                // ���ҹ鲢  
                merge(array, low, mid, high,temp);  
            }  
            return array;  
        }  
       
        public static void merge(int[] array, int first, int mid, int last,int[] temp) {  
         
            int i = first, j = mid + 1;  
            int m = mid,   n = last;  
            int k = 0;  
            // �ѽ�С�������Ƶ���������  
            while (i <= m && j <= n)  
            {  
                if (array[i] <= array[j])  
                    temp[k++] = array[i++];  
                else  
                    temp[k++] = array[j++];  
            }  
            // �����ʣ�������������   
            while (i <= m)  
                temp[k++] = array[i++];  
            // ���ұ߱�ʣ�������������    
            while (j <= n)  
                temp[k++] = array[j++];  
             // ����ʱ�����е�������array����      
            for (i = 0; i < k; i++)  
                array[first + i] = temp[i];  
        }  
       
           
        // �鲢�����ʵ��  
        public static void main(String[] args) {  
       
            int[] array = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };  
            int[] temp=new int[array.length];
            MergeSort.sort(array, 0, array.length-1,temp);  
            System.out.println(Arrays.toString(array));  
        }  
    }