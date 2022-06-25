package LinkList;

public class Main {
    public static void main(String[] args) {


        LL list = new LL();

//        list.insertFirst(43);
//        list.insertAtLastIndex(13);
        list.insertFirst(2);
//        list.insertAtLastIndex(3);
        list.insertFirst(1);
//
        list.InsertBefore(433,2);
//
        list.insert(321,2);
//        list.display();
//        list.insertLastVersion1(90);
        list.insertLast(123);
        list.insertNthPosition(45,2);
        list.display();
    }
}
