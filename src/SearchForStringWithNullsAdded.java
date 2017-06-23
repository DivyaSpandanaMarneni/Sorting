import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by marne on 1/29/2017.
 */
//because some of the strings are nulls we cant directly apply binary search.
    //find the mid and if string[mid] == null then consider the middle one as the nearest non null string

public class SearchForStringWithNullsAdded {

    public static String[] strings;
    public int getTheIndexOfString(String search,int start, int end){

        int mid = (start + end)/2;
        if(!(strings[mid] != null)) {
            int i = 1;
            while (i < strings.length / 2) {
                if (strings[mid+i] != null) {
                    mid = mid + i;
                    break;
                } else if (strings[mid - i] != null) {
                    mid = mid - i;
                    break;

                } else {
                    i++;
                }
            }
        }


            if(search.equals(strings[mid])){
                return mid;
            }

            else if(search.compareTo(strings[mid])<0){
                return getTheIndexOfString(search, 0,mid-1);
            }
            else if(search.compareTo(strings[mid]) > 0){
                return getTheIndexOfString(search,mid+1,end);
            }
            else{
                System.out.println("No such string");
                return -1;
            }








    }

    public static void main(String[] args) throws IOException{
         strings = new String[] {"aaron","chandana",null,null,"divya","innaiah","spandana","suseela"};
        SearchForStringWithNullsAdded search = new SearchForStringWithNullsAdded();

        System.out.println("Enter the string to search");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String st = bufferedReader.readLine();
        int pos = search.getTheIndexOfString(st,0,strings.length-1);
        System.out.println("The string is located at "+pos);




    }
}
