package outDate;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {1038,12,20,30,45,7,8,4,3,5};
        heapSort(array);
    }

    public static void heapSort(int[]aray){
        int n = aray.length;
        for (int i = n/2 -1; i >= 0 ; i--) {
            heapify(aray,i,n);
        }
    }

   public static void heapify(int[] aray, int i, int n) {
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    if (l < n && aray[i] > aray[largest]);
    }

}
