import java.util.ArrayList;

/**
 * Created by marne on 1/25/2017.
 */

class ArrayPartition{
    public int[] array;
    private int nElems;

    public ArrayPartition(int max){
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
            display();
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

    public void quickSortIt(int left,int right){
        if(left<right){
            int q = partition(left,right);
            quickSortIt(left,q-1);
            quickSortIt(q+1,right);
        }
        //return array;
    }
}


public class QuickSort {

    public static void main(String[] args){
        ArrayPartition arrayPartition = new ArrayPartition(10);
        int[] arrayMain = {2,1,7,8,6,3,5,4};

        arrayPartition.array = arrayMain;
        arrayPartition.quickSortIt(0,arrayMain.length-1);
        arrayPartition.display();


        //int index =arrayPartition.partition(0,arrayMain.length-1);
        //System.out.println("index ="+index);





    }



}
