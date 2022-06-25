package LinkList;

public class LL {

    Node head;
    Node tail;

    private int size;

    public LL() {
        this.size=0;
    }

    public void insertFirst(int val){

        Node node= new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size += 1;


    }



    public void insertAtLastIndex(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insert(int val, int index){

        if(index == 0){
            insertFirst(val);
           return;

        }
        Node temp = head;
        for (int i = 1; i < index; i++) {

            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }
//    public void insertAnyIndex(int value, int index){
//

//        if (index == 0){
//            insertFirst(value);
//            return;
//        }
//        Node temp = head;
//        for (int i = 1; i <index ; i++) {
//            temp = temp.next;
//        }
//        Node node = new Node(value,temp.next);
//        temp.next = node;
//        size++;
//
//    }
    public void InsertBefore(int value ,int keyValue) {

    Node temp = head;
    Node prev = null;

        if (head != null) {
            while (temp != null) {
                if (temp.value == keyValue) {
                    Node n = new Node(value);
                    n.next = temp;

                    if (prev != null) {
                        prev.next = n;
                    } else {
                        head = n;
                    }
                    return;
                }

                prev = temp;
                temp = temp.next;
            }
        }
    }



//
//    public void insertAfterSpecificValue(int value ,int spValue){
//        //  4->21->11->38 ->29 ->31->40    before 29 insert 70
//
//        Node temp = head;
////        Node tail = null;
//        Node forward = null;
//
//
//        if(head != null){
//            while(temp != null){
//                if(temp.value == spValue){
//                 Node newNode = new Node(value);
//                 temp.next = newNode;
//                 if(tail == null){
//                     tail= newNode;
//                 }else {
//                     newNode.next = tail;
//                 }
//                 return;
//                }
//                tail = temp;
//                temp = temp.next;
//            }
//        }else {
//            System.out.println("is not possible !");
//        }
//
//    }

    public void insertAfter(int value,Node previous){

        if(previous == null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(value);
        newNode.next = previous.next;
        previous.next = newNode;
        size++;

    }
    public void display(){
        Node temp=head;
        while(temp!=null)
        {

            System.out.print(temp.value+"-> ");
            temp=temp.next;
        }
        System.out.println("END");


    }
    public void insertLastVersion1(int value){
        Node newNode = new Node(value);
        Node temp = head;
         while (temp.next != null){
//             System.out.println(te);
             temp = temp.next;
         }
         temp.next = newNode;
//         temp = newNode;

    }
    public void insertLast( int value){

        if(tail == null){
            insertFirst(value);
        }
        Node node= new Node (value);
        tail.next = node;
        tail = node;
        size++;


    }

    public void insertNthPosition(int value , int nthPosition){

        if (nthPosition == 0){
            insertFirst(value);
            return;
        }
        if( nthPosition == size ){
            insertAtLastIndex(value);
            return;
        }
        Node temp = head;

        for (int i = 1; i <nthPosition ; i++) {

            temp = temp.next;
        }
//        Node node = new Node(value,temp.next);
        temp.next =new Node(value,temp.next);



        size++;


    }



    private class  Node{
         int value;
         Node next;



        public Node(int value){
            this.value= value;
            this.next = null;
        }

        public Node(int value, Node nextNode) {
            this.value = value;
            this.next = nextNode;
        }

    }

}
