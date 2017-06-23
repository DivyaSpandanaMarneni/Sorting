/**
 * Created by marne on 1/25/2017.
 */
public class BubbleSort {

    public int[] sortIt(int[] arr){

        for(int i=0;i<arr.length ;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]<= arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
                else{
                    continue;
                }

            }
        }

        return arr;

    }

    public int[] sortIt2(int[] arr){
        for(int i=arr.length-1; i>1;i--){
            for(int j=0;j<i;j++){

                if(arr[j+1]<= arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
                else{
                    continue;
                }


            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arrayToSort = {10,11,9,0,1,5,3,6};
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayResult = bubbleSort.sortIt(arrayToSort);
        for (int ele :
                arrayResult) {
            System.out.print(ele+" ");
        }

        System.out.println();
        System.out.println("second way");
        int[] arrayResult2 = bubbleSort.sortIt2(arrayToSort);

        for (int ele :
                arrayResult2) {
            System.out.print(ele+" ");
        }

        System.out.println();

    }
}
