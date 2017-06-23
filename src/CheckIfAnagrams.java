import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by marne on 1/28/2017.
 */

//To check if two strings are anagrams of each other
public class CheckIfAnagrams {

    public static void main(String[] args){
        String s1 = "Sp andana";
        String s2 = "andanasp";
        String s3 = "chandana";

        String s4 = "School MASTER";
        String s5 = "The ClassROOM";

        s1 = s1.replaceAll("\\s","");
        s2 = s2.replaceAll("\\s","");
        s3 = s3.replaceAll("\\s","");
        s4 = s4.replaceAll("\\s","");
        s5 = s5.replaceAll("\\s","");


        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        s3 = s3.toLowerCase();
        s4 =s4.toLowerCase();
        s5 = s5.toLowerCase();

        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();
        char[] s3c = s3.toCharArray();
        char[] s4c = s4.toCharArray();
        char[] s5c = s5.toCharArray();

        if(s1.length() != s2.length()){
            System.out.println("s1 and s2 are not anagrams");
            return;
        }
        //we can simple check sort the arrays and check if both are same. then they both are anagrams

        Arrays.sort(s1c);
        Arrays.sort(s2c);

        if(Arrays.equals(s1c,s2c)){
            System.out.println("s1 and s2 are anagrams");
            //return;
        }
        else{
            System.out.println("not anagrams");
            //return;
        }

        if(s1.length() != s3.length()){
            System.out.println("s1 and s3 are not anagrams");
        }

        s3 = s3.toLowerCase();
        Arrays.sort(s3c);

        if(Arrays.equals(s1c,s3c)){
            System.out.println("s1 and s3 are anagrams");
        }
        else{
            System.out.println("s1 and s3 are not anagrams");
        }

        Arrays.sort(s4c);
        Arrays.sort(s5c);

        if(Arrays.equals(s4c,s5c)){
            System.out.println("s4 and s5 are anagrams");
        }
        else{
            System.out.println("s4 and s5 are not anagrams");
        }




    }
}
