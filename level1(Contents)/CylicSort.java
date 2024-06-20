import java.util.Arrays;

public class CylicSort {
    static void cyclicSort(int[]arr){
        int i = 0;
        while(i<arr.length){
            int changeIndex = arr[i]  - 1;
            if(arr[i] != arr[changeIndex]){
                swap(arr,i,changeIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[]arr,int i,int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
    public static void main(String[] args) {
         int[] numbers= {3,5,4,2,1};
        cyclicSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
