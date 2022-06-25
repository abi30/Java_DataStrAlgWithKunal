package allSortAlgo;

import java.util.Arrays;

public class insertionSort {
    public static void main(String [] args){


        int[] arr={7,2,5,6,4,3,1};

        int [] array=insertion(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));

        Node head=new Node(4);
//        Node nodeB=new Node(2);
//        Node nodeC=new Node(3);
//        Node nodeD=new Node(10);

//        head.next=nodeB;
//        nodeB.next=nodeC;
//        nodeC.next=nodeD;

        System.out.println(countNodes(head));

    }

    static  int countNodes(Node head){
        int count=0;
        if(head == null) {
            return 0;
        }
        Node current=head;

        while (current!=null){

            count++;
            current=current.next;
        }
            return count;
    }

    static int[] insertion(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j > 0; j--){
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                }else {
                    break;

                }
            }
        }
        return array;

    }

    public static void swap(int[]arr,int index1,int index2) {


        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }


}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
