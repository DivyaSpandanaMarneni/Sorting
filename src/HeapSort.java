/**
 * Created by marne on 1/30/2017.
 */
public class HeapSort {


    public static int[] array;


    public int[] maxHeapify(int i,int length){

        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < length && array[left] > array[i]){
            largest = left;
        }
        else
            largest = i;
        if(right < length && array[right] > array[largest])
            largest= right;

        if(largest != i){
            //swap and the values at largest and at i;

            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            maxHeapify(largest,length);
        }


        return array;
    }

    public void buildMaxHeap(){
        int i = array.length/2 -1;

        for(int j = i;j>=0;j--){
            maxHeapify(j,array.length);
        }

    }

    public void heapSort(){
        buildMaxHeap();

        for(int i = array.length-1;i>=1;i--){
            //swap array[0] with arr[length] - exchange root and last element in the tree as max is located at root of the tree;
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //i++;

            maxHeapify(0,i);
         }
    }

    public static void main(String[]  args){
         array= new int[] {6,1,9,10,4,3,8,7};
        for (int ele :
                array) {
            System.out.print(ele +" ");
        }
        System.out.println();

        //build max heap

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort();

        System.out.println("After heap sort");
        for (int ele :
                array) {
            System.out.print(ele +" ");
        }
        System.out.println();




    }
}
