/**
 * Created by marne on 1/25/2017.
 */
public class ShellSort {

    public int[] shellSort(int[] array){

        //construct the h values
        //club the insertion sort partially
        int in,out;
        int temp;
        int h=1;
        //how to construct the h values and work with them
        while (h<=array.length/3){
            h = h*3 +1;
        }

        while (h >0){
            for(out = h;out < array.length;out++){
                temp = array[out];
                in = out;

                while (in > h-1 && array[in-h]>= temp){
                    array[in] = array[in-h];
                    in = in-h;
                }

                array[in] = temp;

                System.out.println("At h ="+h+" out="+out);
                for (int ele :
                        array) {
                    System.out.print(ele+" ");
                }
                System.out.println();

            }//end of for
            h = (h-1)/3;

        }//end of while



        return array;
    }

    public static void main(String[] args){
        int[] input = {20,89,6,42,55,59,41,69,75,66,5,10,15,100,21,77,66,33,99,121};
        ShellSort shellSort = new ShellSort();
        int[] result = shellSort.shellSort(input);

        for (int ele :
                result) {
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
