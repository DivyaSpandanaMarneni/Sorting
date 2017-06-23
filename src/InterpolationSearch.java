import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by marne on 1/30/2017.
 */
public class InterpolationSearch {

    public int getIndex(int[] array, int element,int from, int to){

        if(element == array[from])
            return from;

        if(from == to || array[from] == array[to])
            return -1;

        int index = from + ((to-from)/(array[to]-array[from])) * (element - array[from]);

        if(array[index] == element)
            return index;
        else if(element > array[index]){
            return getIndex(array,element,index+1,to);
        }
        else{
            return  getIndex(array,element,from,index-1);
        }

    }

    public static void main(String[] args) throws IOException{
        int[] arrayToSearch = {12,24, 36, 48, 60, 72, 84, 96, 108, 120};
        System.out.println("Enter the element to search for :");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int searchItem = Integer.parseInt(bufferedReader.readLine());

        InterpolationSearch interpolationSearch = new InterpolationSearch();
        System.out.println("the eleemnt is at "+ interpolationSearch.getIndex(arrayToSearch,searchItem,0,arrayToSearch.length-1));
    }
}
