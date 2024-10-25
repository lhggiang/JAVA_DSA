
public class Main {
    //insert
    public static Node insertBegin(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }
    public static Node insertEnd(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = newNode;
        return head;
    }
    public static Node insertMiddle(Node head, int val, int pos){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }
        if(pos == 0){
            return insertBegin(head,val);
        }
        int cnt = 0;
        Node tmp = head;
        while(tmp!=null){
            ++cnt;
            if(cnt == pos){
                newNode.next = tmp.next;
                tmp.next = newNode;
                break;
            }
            tmp = tmp.next;
        }
        return head;
    }
    public static void print(Node head){
        if(head == null) {
            System.out.println("Linked List is empty");
        }
        else {
            Node tmp = head;
            while(tmp!=null) {
                System.out.print(tmp.val + " ");
                tmp = tmp.next;
            }
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

//        print(insertBegin(n1,0));
//        print(insertEnd(n1,4));

        print(insertMiddle(n1,4,3));

    }
}
