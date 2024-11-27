package olga.classActivity2A;

public class SinglyListEx {

    // class activity 2A
    // the head is responsible for holding the linked list and is always set to null at first

    // code to implement the linked list
    private ListNode head;

    // ListNode contains both the data and the next reference
    private static class ListNode {
        private int data; // this represent the content of the list

        private ListNode next; // this is the pointer to the next node

        public ListNode(int data) {
            /**
             * when we create a singly linked list we only add the data,
             * because by default the next reference always point to null
             */
            this.data = data;
            this.next = null;
        }
    }

    // do this last to print out the singly list after 2A
    public void displayList(){
        ListNode current = head;

        while (current != null){
            System.out.print(current.data + " ---> ");
           // System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("null");
    }


    // class activity 2A1 - count length of a linked list
    public int displayLength(){
        if(head == null){
            return 0;
        }

        int countList = 0;
        ListNode current = head;
        while (current != null){
            countList++;
            current = current.next;
        }
        return countList;

    }

    // class activity 2A2 - insert node at the beginning of a linked list
    public void insertNodeFirst(int value){
        ListNode newNodeValue = new ListNode(value);
        newNodeValue.next = head;
        head = newNodeValue;
    }

    // class activity 2A3 - insert node at the end of the linked list
    public void insertNodeLast(int value){
        ListNode newNodeValue = new ListNode(value);

        if(head == null){
            head = newNodeValue;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNodeValue;
    }



    public static void main(String[] args) {
        SinglyListEx linkedList = new SinglyListEx();

        //class activity 2A
        linkedList.head = new ListNode(20);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(5);

        // now we connect them together to form a chain which we make our singly linked list
        linkedList.head.next = second; // 20 --->  10
        second.next = third; // 20 ---> 10 ---> 15
        third.next = fourth; // 20 ---> 10 ---> 15 ---> 5 ---> null

        // do this only for class activity 2A2 - for inserting node at beginning
        linkedList.insertNodeFirst(100);
        linkedList.insertNodeFirst(200);
        linkedList.insertNodeFirst(300);



        // do this only for class activity 2A3 - for inserting node at the end
        linkedList.insertNodeLast(100);
        linkedList.insertNodeLast(200);
        linkedList.insertNodeLast(300);

        // do this after writing the display method
        linkedList.displayList();

        // do this only for class activity 2A1
        System.out.println("Total length is - " + linkedList.displayLength());

    }
}