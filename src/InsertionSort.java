/**
 * Created by marne on 1/25/2017.
 */
public class InsertionSort {

    public int[] sortIt(int[] arr){

        int in,out;
        //comparision = 1+2+... n-1 = n(n-1)/2 = O(n^2) - but on average we have to compare only half way until the required next greater element is found
        //therefore the avg number of comparison = n(n-1)/4
        for(out=1;out<arr.length;out++){
            int temp = arr[out];
            in = out;
            //for already sorted array while loop is never true and hence run time is O(n)
            while (in > 0 && arr[in-1] >= temp){
                arr[in] = arr[in-1];
                in--;
            }//end of while

            arr[in] = temp;
        }//end of for


        return arr;
    }//end of sortIt method

    public static void main(String[] args){
        int[] arrayToSort = {10,11,9,0,1,5,3,6};
        InsertionSort insertionSort = new InsertionSort();

        int[] result = insertionSort.sortIt(arrayToSort);
        for (int ele :
                result  ) {
            System.out.print(ele+" ");
        }

        System.out.println();
    }
}
