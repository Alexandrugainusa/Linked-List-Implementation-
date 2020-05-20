public class Runner {

    public static void main(String[] args) {

        Node first = new Node(1);
        LnkedList list = new LnkedList(first);
        list.insert(3);
        list.insert(7);
        list.insert(10);
        list.insert(13);
        list.insert(27);
        list.insert(33);
        list.insert(37);

        list.show();

       // System.out.println(list);






    }
}
