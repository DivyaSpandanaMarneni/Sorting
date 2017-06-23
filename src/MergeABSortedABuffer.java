/**
 * Created by marne on 1/28/2017.
 */

//Two arrays A and B are there which are already sorted. A has enough buffer. A and B are sorted. Compare each element in B with elements in
    //array A and find the position for B. shift the elements in A to the end and place B.
    //but this involves shifting the elements in A from starting.

    //But if we go from back, the number shifts involved will be less compared to the first appraoch
    //we can directly put the element at last and it will be a constant time operation
public class MergeABSortedABuffer {
    private static int bufferA=0;
    private int[] A;
    private int[] B;
    public MergeABSortedABuffer(){

    }
    public MergeABSortedABuffer(int asize,int bsize){
        bufferA = asize+bsize;
        A = new int[asize+bsize];
        B = new int[bsize];
    }

    public int[] mergeAB(int[] a,int[] b, int asize, int bsize){

        while(asize>=0 && bsize>=0){
            while (b[bsize] < a[asize]){
                a[--bufferA] = a[asize--];
            }
            a[--bufferA] = b[bsize--];

        }

        while (bsize >=0) {
        a[--bufferA] = b[bsize--];
        }




        return a;
    }


    public static void main(String[] args){

        int[] a = new int[] {2,4,6,7};
        int[] b = new int[] {1,3,5,9,11,15,17,19};



        int asize = a.length;
        int bsize = b.length;
        MergeABSortedABuffer mergeABSortedABuffer = new MergeABSortedABuffer(asize,bsize);

        for(int i=0;i<asize;i++){
            mergeABSortedABuffer.A[i] = a[i];
        }
        for(int i=0;i<bsize;i++){
            mergeABSortedABuffer.B[i] = b[i];
        }
        //mergeABSortedABuffer.A = a;
        //mergeABSortedABuffer.B = b;
        System.out.println("A's buffer size "+mergeABSortedABuffer.A.length);

        System.out.println("ab lengths are "+asize+", "+bsize);
        
        int[] result = mergeABSortedABuffer.mergeAB(mergeABSortedABuffer.A,mergeABSortedABuffer.B,asize-1,bsize-1);

        for (int ele :
                result) {
            System.out.print(ele+" ");
        }
        System.out.println();



    }

}
