import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by marne on 1/29/2017.
 */
public class BinarySearch {

    public static Integer[] arrayToSort;
    public int getIndexOfElement(int search,int start, int end){
        int mid = start + (end-start +1)/2;

        if(search == arrayToSort[mid]){
            return mid;
        }

        if(start < end){

            if(search < arrayToSort[mid]){
                return getIndexOfElement(search,start,mid-1);
            }
            else if(search > arrayToSort[mid]){
                return getIndexOfElement(search,mid+1,end);
            }
            else{
                System.out.println("No such element");
                return -1;
            }

        }
        else{
            System.out.println("No element found ");
            return -1;
        }

    }

    public static void main(String[] args) throws IOException{
         arrayToSort = new Integer[] {10,7,3,9,4,8,6,1};
        Arrays.sort(arrayToSort);

        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Enter the element to search");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int element = Integer.parseInt(bufferedReader.readLine());

        int index = binarySearch.getIndexOfElement(element,0,arrayToSort.length-1);
        if(index!= -1) {
            System.out.println("The element is at " + index);
        }
        else{
            System.out.println("The element is not found");
        }
    }
}
