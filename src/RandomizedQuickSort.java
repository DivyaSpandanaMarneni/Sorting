import java.util.Random;

/**
 * Created by marne on 1/30/2017.
 */

class RandomizedArrayPartition{
    public int[] array;
    private int nElems;

    public RandomizedArrayPartition(int max){
        array = new int[max];
        this.nElems = 0;

    }
    public void display(){
        for (int ele :
                array) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public int partition(int left,int right){

        int pivot = array[right];
        int i = left-1;
        int j = 0;

        for (j=left;j<right;j++){

            System.out.println("At j = "+j);
            //display();
            if(array[j]<= pivot){
                i++;

                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
            System.out.println("after swapping");
            display();
        }
        i=i+1;
        int temp = array[right];
        array[right] = array[i];
        array[i] = temp;


        System.out.println("Before returning the partition");
        display();
        return i;


    }//end of partition method;

    public int randomizedPartition(int left,int right ){
        Random random = new Random();

        //create a new array and copy the left to right elements and then select random
        int index = left + (new Random().nextInt()) % (right-left+1);
        int i = array[index];

        System.out.println("The random index is "+index+" and element is "+array[index]);
        int temp = array[i];
        array[i] = array[right];
        array[right] = temp;
        display();

        return partition(left,right);
    }

    public void quickSortIt(int left,int right){
        if(left<right){
            int q = randomizedPartition(left,right);
            quickSortIt(left,q-1);
            quickSortIt(q+1,right);
        }
        //return array;
    }
}

public class RandomizedQuickSort {

    public static void main(String[] args){

        int[] arrayToSort = {2,1,7,8,6,3,5,4};
        RandomizedArrayPartition randomizedArrayPartition = new RandomizedArrayPartition(12);
        randomizedArrayPartition.array = arrayToSort;
        randomizedArrayPartition.quickSortIt(0,arrayToSort.length-1);
        randomizedArrayPartition.display();



    }
}
