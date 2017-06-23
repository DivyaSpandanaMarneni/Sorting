/**
 * Created by marne on 1/25/2017.
 */
public class SelectionSort {

    public int[] sortIt(int[] arr){
        //based on selecting the min and placing the value in the leftmost position
        int min =0;
        for(int i=0;i<arr.length;i++){
           min=i;//element to find the minimum index
           for(int j=i+1;j<arr.length;j++){
               if(arr[j] < arr[min]){
                   min = j;
               }
           }//end of inner for
            //swap elements at min and i

            //the below code is for swapping - swaps are O(n)
            //where as comparisons are O(n^2) similar to bubble sort
            //elements to the left of i value are always sorted and this is loop invariant in selection sort
           int temp =  arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }//end of outer for

        return arr;
    }

    public static void main(String[] args){
        int[] arrayToSort = {10,11,9,0,1,5,3,6};
        SelectionSort selectionSort = new SelectionSort();

        int[] result = selectionSort.sortIt(arrayToSort);
        for (int ele :
                result  ) {
            System.out.print(ele+" ");
        }

        System.out.println();

    }
}
