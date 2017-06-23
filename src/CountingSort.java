/**
 * Created by marne on 1/30/2017.
 */
public class CountingSort {

    public int[] countSort(int[] array){
        //find the max element of the array and create a temporary array with that size

        int max = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i] > max)
                max = array[i];
        }

        int[] arrayC = new int[max+1];
        int[] arrayB = new int[array.length];

        System.out.println("max = "+max+ " arrac length ="+arrayC.length);

//        for(int i =0;i<max;i++){
//            arrayC[i] = 0;
//        }

        for(int i = 0;i<array.length;i++){
            arrayC[array[i]] = arrayC[array[i]]+1;
        }

        for(int i=1;i<arrayC.length;i++){
            arrayC[i] =  arrayC[i] +arrayC[i-1];
        }

        for(int j=array.length-1;j>=0;j--){
            arrayB[arrayC[array[j]]-1] = array[j];
            arrayC[array[j]] = arrayC[array[j]] -1;
        }



        return arrayB;
    }

    public static void main(String[] args){
        int[] arrayToSort = {2,1,2,8,8,3,4,4};
        CountingSort countingSort = new CountingSort();
        int[] result = countingSort.countSort(arrayToSort);

        for (int ele :
                result) {
            System.out.print(ele+" ");
        }

        System.out.println();

    }
}
