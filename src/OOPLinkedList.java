public class OOPLinkedList {
    private int head;
    private OOPLinkedList tail;

    public OOPLinkedList(int head, OOPLinkedList tail){
        this.head = head;
        this.tail = tail;
    }

    public int getHead() {
        return head;
    }

    public OOPLinkedList getTail() {
        return tail;
    }

    public void setHead(int value) {
        this.head = value;
    }

    public void setTail(OOPLinkedList tail) {
        this.tail = tail;
    }

    public void addHead(int newHead){
        tail = new OOPLinkedList(head, tail);
        head = newHead;
    }

    public int removeHead(){
        if (tail != null) {
            int temp = head;
            head = tail.getHead();
            tail = tail.getTail();
            return temp;
        } else {
            System.out.println("Head removal failure");
            return 0;
        }
    }

    public int getLength(){
        if (tail == null){
            return 1;
        } else {
            return 1 + tail.getLength();
        }
    }

    public int getnth(int n){
        if (n <= 0) {
            System.out.println("Retrieval failure, index out of range");
            return 0;
        }
        if (n==1){
            return head;
        }
        if (tail == null){
            System.out.println("Retrieval failure, index out of range");
            return 0;
        }
        return tail.getnth(n-1);
    }

    public static void main(String[] args) {
        OOPLinkedList list = new OOPLinkedList(0, null);
        list.setHead(25);
        list.addHead(20);
        list.addHead(15);
        list.addHead(10);
        list.addHead(5);

        System.out.println("Testing length of [5, 10, 15, 20, 25], expecting 5:");
        if (list.getLength() == 5){
            System.out.println("Test successful");
        } else {
            System.out.println("Test failure");
        }

        System.out.println("Testing getnth(4) of [5, 10, 15, 20, 25], expecting 20:");
        if (list.getnth(4) == 20){
            System.out.println("Test successful");
        } else {
            System.out.println("Test failure");
        }
    }
}
