import java.util.*;

/**
 * Created by marne on 1/29/2017.
 */
public class LongestSubStringNoRepeatingChar {

    public int lengthOfLongestSubstring(String s) {

        char[] ch = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<ch.length; i++){
            if(set.contains(ch[i])){
                //set.clear();
                //int index = list.indexOf(ch[i]);
                return Math.max(lengthOfLongestSubstring(s.substring(1,s.length())),lengthOfLongestSubstring(s.substring(0,s.length()-1)) );
            }
            else{
                set.add(ch[i]);
            }
        }

        for (Character   ele :
                set ) {
            System.out.print(ele+" ");
        }
        System.out.println();

        return set.size();

    }

    public static void main(String[] args){

        LongestSubStringNoRepeatingChar longest = new LongestSubStringNoRepeatingChar();
        int length = longest.lengthOfLongestSubstring("ABCDABDEFGCABD");
        System.out.println("the lenght is "+length);

    }
}
