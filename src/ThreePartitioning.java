/**
 * Created by marne on 1/25/2017.
 */

class ThreePartition{
    public Integer[] array;
    public int nEle;

    public ThreePartition(int max){
        array = new Integer[max];
        nEle = 0;
    }

    public int partitionTheArray(int left, int right){

        //Comparable[] a = (Comparable<Integer>[]) array;
        Comparable[] a = (Comparable[]) array;
        int mid = (left+right)/2;
        int pivot=0;

        if(a[mid].compareTo(a[left])<0){
            if(a[left].compareTo(a[right])<0)
                pivot = left;
            else{
                if(a[right].compareTo(a[mid])<0)
                pivot =mid;
                else {
                    pivot =right;
                }

            }

        }

        else{
            if(a[right].compareTo(a[left])<0){
                pivot = left;
            }
            else{
                if(a[right].compareTo(a[mid])>0){
                    pivot = mid;
                }
                else{
                    pivot=right;
                }

            }
        }


        int i = left-1;
        Integer pivotVal = (Integer) a[pivot];
        for(int j=left; j<right;j++){
            if(a[j].compareTo(pivotVal)<=0){

                i++;
                Integer temp = (Integer)a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }

        i++;

        //swapping the pivot and value;
        Integer temp = (Integer) a[i];
        a[i] = a[pivot];
        a[pivot] = temp;


        array = (Integer[])a;
        return i;

    }


    public void quickSort(int left,int right){
        if(left<right){
            int q = partitionTheArray(left,right);
            quickSort(left,q-1);
            quickSort(q+1,right);
        }
    }
}
public class ThreePartitioning {

    public static void main(String[] args){
        Integer[] arrayInput = {2,1,7,8,6,3,5,4};
        ThreePartition threePartition = new ThreePartition(10);

        threePartition.array = arrayInput;
        threePartition.quickSort(0,arrayInput.length-1);

        for (Integer ele :
                threePartition.array) {
            System.out.print(ele+" ");
        }
    }


}
