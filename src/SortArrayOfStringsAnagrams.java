import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by marne on 1/28/2017.
 */

//This is to sort the array of strings so that all anagrams are next to each other
public class SortArrayOfStringsAnagrams {

    public boolean isAnagram(String s1, String s2){

        s1 = s1.replaceAll("\\s","");
        s2 = s2.replaceAll("\\s","");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();

        Arrays.sort(s1c);
        Arrays.sort(s2c);

        if(Arrays.equals(s1c,s2c))
            return true;
        return false;
    }//end of isAnagram method

    public static void main(String[] args){
        SortArrayOfStringsAnagrams anagrams = new SortArrayOfStringsAnagrams();

        //This takes O(n^2)
        String[] strings = new String[] {"Spandana","Chandana","Suseela","Aaron","andanasp","lasusee","chonni"};
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i=0;i<strings.length;i++){

            if(!arrayList.contains(strings[i])) {
                arrayList.add(strings[i]);
                for (int j = i + 1; j < strings.length; j++) {
                    if (anagrams.isAnagram(strings[i], strings[j])) {
                        arrayList.add(strings[j]);
                    }
                }
            }
        }

        for (String st :
                arrayList) {
            System.out.print(st+" ");
        }
        System.out.println();


    }
}
