import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by marne on 1/26/2017.
 */
public class RadixSort {
    public int[] sortIt(int[] arr){
        LinkedList<ArrayList<Integer>> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        int[] tempArray;
       //find the max element in the array so that we can interate based on it

        int max = 0;
        for (int ele :
                arr) {
            if(ele > max)
                max=ele;
        }


       // int i = 1;
        //while (max/10 != 0) {
            for (int ele :
                    arr) {

                int index = ele%10;
                arrayList = linkedList.get(index);
                arrayList.add(ele);

            }

         tempArray = new int[arr.length];
            int i = 0;
        for (ArrayList<Integer> al :
                linkedList ) {
            for (Integer ele :
                    al) {
                tempArray[i] = ele;
                if(i<arr.length-1)
                    i++;
            }
        }





        return arr;
    }

    public static void main(String[] args){

    }
}
