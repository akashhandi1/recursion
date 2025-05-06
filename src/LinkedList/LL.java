package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void inserFirst(int val){
        Node node = new Node(val);
        node.next  = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size +=1;

    }

    public void insertLast(int val){
        if(tail == null){
            inserFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size +=1;

    }

    public void insertatindex(int val, int index){
        if(index == 0){
            inserFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp =head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public  int deletefirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail =null;
        }
        size--;

        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deletelast(){
        if(size <= 1){
            deletefirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int deleteatindex(int index){
        if(index == 0){
            deletefirst();
        }

        if(index == size-1){
            deletelast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }

    public int find(int value){
        Node node = head;
        int index = 0;
        while(node != null){
            if(node.value == value){
                return index;
            }
            node = node.next;
            index++;

        }
        return -1;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.print("end ");
    }

    private class Node{
        private int value;
        private  Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next ) {
            this.value = value;
            this.next = next;
        }
    }
}