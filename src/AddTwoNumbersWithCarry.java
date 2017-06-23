/**
 * Created by marne on 1/29/2017.
 */
public class AddTwoNumbersWithCarry {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;

        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = null;
        ListNode tail=null;
        int carry=0;

        while(l1 != null && l2 != null){
            int val1 = l1.val;
            int val2 = l2.val;





            int sum = val1 + val2 + carry;
            //if(sum/10==0){
            ListNode temp = new ListNode(sum%10);
            if(result == null){
                result = temp;
                tail = result;

            }
            else{


                tail.next = temp;
//                if(result.next == null){
//                    result.next = tail;
//                }
                tail = tail.next;


            }
            carry = sum/10;


            l1=l1.next;
            l2= l2.next;

        }

        while(l1!=null){
            tail.val = l1.val+carry;
            l1=l1.next;
            tail = tail.next;
        }

        while(l2 != null){
            tail.val = l2.val+carry;
            l2= l2.next;
            tail = tail.next;

        }


        ListNode temp = result;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }

        System.out.println();



        return result;

    }

    public static void main(String[] args){
        ListNode listNode1 = new ListNode(2);
        ListNode tail1 = listNode1;

        tail1.next = new ListNode(4);
        tail1 = tail1.next;
        tail1.next = new ListNode(3);


        ListNode listNode2 = new ListNode(5);
        ListNode tail2 = listNode2;

        tail2.next = new ListNode(6);
        tail2 = tail2.next;
        tail2.next = new ListNode(4);

        AddTwoNumbersWithCarry addition = new AddTwoNumbersWithCarry();
        ListNode result = addition.addTwoNumbers(listNode1,listNode2);

        ListNode temp = result;
        while(temp!= null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }



    }
}
