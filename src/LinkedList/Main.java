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
        list.display();
        System.out.println(list.deletefirst());
        list.display();
        System.out.println(list.deletelast());
        list.display();
        System.out.println(list.deleteatindex(3));
        list.display();
        System.out.println(list.find(100));
        list.display();
    }
}
