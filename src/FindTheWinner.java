import java.util.Arrays;

/**
 * Created by marne on 1/30/2017.
 */
//the array has the id of the cadidate for whom an vote is given by ith person
    //find the winner

    //count the number of times an id is repeating and the maximum count gives the winner
public class FindTheWinner {
    public int findTheWinner(int[] array){

        int winnerId = 0;
        int counter = 0;
        int max = 0;
        for(int i=0;i<array.length;i++){
            counter = 0;
            counter++;

            for(int j=1;j<array.length;j++){
                if(array[i] ==array[j])
                    counter++;
            }

            if(counter > max){
                max = counter;
                winnerId = array[i];
            }



        }

        return winnerId;
    }

    public int findTheWinnerImproved(int[] array){

        int winnerId = 0;
        int counter = 0;
        int max = 0;

        for(int i = 1; i<array.length;i++){
            counter++;
            if(array[i]==array[i-1]){
                counter++;
            }
            if(i< array.length-1 && array[i] != array[i+1]){
                if(counter>max){
                    max= counter;
                    winnerId = array[i];
                }
                counter = 0;
            }


        }


        return winnerId;
    }

    public static void main(String[] args){
        int[] findWinner = {5,8,1,0,5,5,3,5,5,1,2,6,2};

        FindTheWinner findTheWinner = new FindTheWinner();
        int winner = findTheWinner.findTheWinner(findWinner);
        System.out.println("won by "+winner);


        //second strategy is to sort the array and then compare the nearby elements instead of all the elements in the array

        Arrays.sort(findWinner);

        System.out.println("Winner using second approach "+findTheWinner.findTheWinnerImproved(findWinner));


    }
}
