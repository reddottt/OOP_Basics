package LinkedList;

public class LinkedListRealization {
    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(this.head == null){
            this.head = node;
        } else {
            Node tempNode = this.head;
            while(tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
    }

    public int get(int index){
        Node gNode = this.head;

        for (int i = 0; i < index; i++) {
            gNode = gNode.next;
        }
        System.out.println("Element in index " + index + " is: " + gNode.data);

        return gNode.data;
    }

    public void display(){
        Node dNode = this.head;

        while (dNode.next != null){
            System.out.println(dNode.data);
            dNode = dNode.next;
        }
        System.out.println(dNode.data);
    }

}

class Node{
    int data;
    Node next;
}
