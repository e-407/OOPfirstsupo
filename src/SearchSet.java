public class SearchSet {
    private int numElements;
    private BinaryTreeNode head;

    public SearchSet() {
        this.numElements = 0;
        this.head = null;
    }

    public int getNumElements() {
        return numElements;
    }

    public void insert(int newValue) {
        if (head == null){
            head = new BinaryTreeNode(newValue);
            numElements++;
        } else {
            treeInsert(newValue, head);
        }
    }

    private void treeInsert(int newValue, BinaryTreeNode node) {
        int value = node.getValue();
        if (newValue == value) {
            return;
        }
        if (newValue < value) {
            if (node.getLeft() == null) {
                node.setLeft(new BinaryTreeNode(newValue));
                numElements++;
            } else {
                treeInsert(newValue, node.getLeft());
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new BinaryTreeNode(newValue));
                numElements++;
            } else {
                treeInsert(newValue, node.getRight());
            }
        }
    }

    public boolean contains(int value) {
        if (head == null){
            return false;
        } else {
            return treeContains(value, head);
        }
    }

    public boolean treeContains(int value, BinaryTreeNode node) {
        int nodeValue = node.getValue();
        if (nodeValue == value) {
            return true;
        }
        if (value < nodeValue) {
            if (node.getLeft() == null) {
                return false;
            } else {
                return treeContains(value, node.getLeft());
            }
        } else {
            if (node.getRight() == null) {
                return false;
            } else {
                return treeContains(value, node.getRight());
            }
        }
    }

    public static void main(String[] args) {
        SearchSet set = new SearchSet();

        System.out.println("Testing insert(10), insert(5), insert(15), expecting numElements: 3");
        set.insert(10);
        set.insert(5);
        set.insert(15);

        if (set.getNumElements() == 3) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing insert(10), expecting numElements: 3");
        set.insert(10);

        if (set.getNumElements() == 3) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing contains(5), expecting: true");
        if (set.contains(5)) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing contains(20), expecting: false");
        if (!set.contains(20)) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }
    }
}