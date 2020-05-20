public class LnkedList {

    public Node head;

    public LnkedList(Node first) {
        this.head = first;
    }

    public void insert(int data){
        Node node = new Node(data);
        node.data = data;

        if (head == null){
            head = node;
        }else{
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){

        Node node = head;
        while (node.next != null){
            System.out.print(" "+ node.data);
            node = node.next;
        }
        System.out.print(" "+ node.data);
    }

    @Override
    public String toString() {
        return "LnkedList{" +
                "head=" + head +
                '}';
    }
}
