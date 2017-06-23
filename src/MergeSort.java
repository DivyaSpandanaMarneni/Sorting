/**
 * Created by marne on 1/30/2017.
 */
public class MergeSort {

    public void merge(int[] array, int p, int q, int r){
        int n1 = q-p +1;
        int n2 = r-q;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i] = array[p+i];
        }

        for(int i =0;i<n2;i++){
            arr2[i] = array[q+i+1];
        }

        int i=0,j=0;
        int k = p; //k has to be initialized to p
        //int tempEle = 0;
        while (i<n1 && j <n2){
            if(arr1[i] < arr2[j]){
                //tempEle = array[k];
                array[k] = arr1[i];

                i++;
            }
            else{
                //tempEle = array[k];
                array[k] = arr2[j];
                //array[k+1] = tempEle;
                j++;
            }
            k++;
        }

        while (i<n1){
            array[k] = arr1[i];
            i++;
            k++;
        }

        while (j<n2){
            array[k] = arr2[j];
            j++;
            k++;
        }

    }

    public void mergeSort(int[] array, int p, int r){
        if(p<r){
            int q = (p+r)/2;

            mergeSort(array,p,q);
            mergeSort(array,q+1,r);
            merge(array,p,q,r);

        }
    }


    public static void main(String[] args){
        MergeSort mergeSort = new MergeSort();
        int[] arrayToSort = {20,15,1,18,91,100,5,7,11};
        //int[] temp = arrayToSort;

        System.out.println("Before sorting the array");
        for (int ele :
                arrayToSort) {
            System.out.print(ele+" ");
        }

        System.out.println();

        System.out.println("after sorting");
        mergeSort.mergeSort(arrayToSort,0,arrayToSort.length-1);

        for (int ele :
                arrayToSort) {
            System.out.print(ele+" ");
        }


    }
}
