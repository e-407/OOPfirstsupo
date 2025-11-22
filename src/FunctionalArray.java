public class FunctionalArray {
    private BinaryTreeNode root;
    private int size;

    public FunctionalArray(int size){
        this.size = size;
        root = buildTree(size);
    }

    private BinaryTreeNode buildTree(int n){
        if (n <= 0){
            return null;
        }
        BinaryTreeNode node = new BinaryTreeNode(0);
        node.setLeft(buildTree(n/2));
        node.setRight(buildTree(n-1-(n/2)));
        return node;
    }

    public int get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return getRecursive(index, root);
    }

    public int getRecursive(int index, BinaryTreeNode node){
        if (index == 0){
            return node.getValue();
        }
        if (index % 2 == 0){
            return getRecursive((index/2)-1, node.getRight());
        } else {
            return getRecursive((index/2), node.getLeft());
        }
    }

    public void set(int index, int value){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        setRecursive(index, value, root);
    }

    public void setRecursive(int index, int value, BinaryTreeNode node){
        if (index == 0){
            node.setValue(value);
            return;
        }
        if (index % 2 == 0){
            setRecursive((index/2)-1, value, node.getRight());
        } else {
            setRecursive((index/2), value, node.getLeft());
        }
    }

    public static void main(String[] args) {
        FunctionalArray array = new FunctionalArray(10);

        System.out.println("Testing set(0, 100) and get(0), expecting: 100");
        array.set(0, 100);
        if (array.get(0) == 100) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing set(8, 50) and get(8), expecting: 50");
        array.set(8, 50);
        if (array.get(8) == 50) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing get(10), expecting: Exception");
        try {
            array.get(10);
            System.out.println("Test failed");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Test successful");
        }
    }
}
