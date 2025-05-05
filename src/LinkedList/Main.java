package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.inserFirst(3);
        list.inserFirst(2);
        list.inserFirst(8);
        list.inserFirst(1);


        list.insertLast(17);
        list.insertLast(18);
        list.insertLast(19);
        list.insertLast(11);

        list.insertatindex(100,3);

        System.out.println(list.deletefirst());

        list.display();
    }
}
