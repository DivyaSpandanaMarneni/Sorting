import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by marne on 1/29/2017.
 */
public class SearchOnSortedRotatedArray {

    public static Integer[] arrayToSort;
    public int getIndexOfElement(int search,int start, int end){

        int mid = start + (end-start +1)/2;

        if(search == arrayToSort[mid])
            return mid;

        if(start < end){
            if(arrayToSort[start] <= search  || search < arrayToSort[mid] ){
                return getIndexOfElement(search,start,mid-1);
            }
            else if(arrayToSort[mid] < search || search <= arrayToSort[end]){
                return getIndexOfElement(search,mid+1,end);
            }
            else {
                System.out.println("Element not there in the array");
                return  -1;
            }
        }
        else{
            System.out.println("Element not there in the array");
            return  -1;
        }

        //return -1;
    }

    public static void main(String[] args) throws IOException{
        arrayToSort = new Integer[] {35,5,10,15,20,30};
        System.out.println("Enter the element to search");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int element = Integer.parseInt(bufferedReader.readLine());
        SearchOnSortedRotatedArray search = new SearchOnSortedRotatedArray();
        int index = search.getIndexOfElement(element,0,arrayToSort.length-1);
        System.out.println("The element is located at "+index);
    }

}
