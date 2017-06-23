//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by marne on 1/29/2017.
// */
//public class FindMedian {
//
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        int s1 = nums1.length;
//        int s2 = nums2.length;
//        double mid =0;
//
//        List<Integer> arrayList = new ArrayList<>(s1+s2);
//
//        for(int i = 0;i<nums1.length;i++){
//            arrayList.add(nums1[i]);
//        }
//
//        for(int i = 0;i<nums2.length;i++){
//            arrayList.add(nums2[i]);
//        }
//
//
//
//        //arrayList.addAll(Arrays.asList(nums2));
//        double median = Double.MIN_VALUE;
//
//        int totalLength = arrayList.size();
//
//        if(totalLength%2 == 0){
//            mid = totalLength/2;
//            median =(double) ((double) arrayList.get(mid) + (double) arrayList.get(mid-1))/(double)2;
//
//        }
//        else{
//            mid = (totalLength/2);
//            int middle = Math.ceil(mid);
//            median = (double) arrayList.get(middle);
//        }
//
//        return median;
//    }
//
//    public static void main(String[] args){
//        int abc = 2;
//       // double xyz = Integer.get
//    }
//}
