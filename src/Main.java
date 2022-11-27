public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        System.out.println("===================================================");
        bt.add(7);
        bt.add(5);
        bt.add(12);
        bt.add(3);
        bt.add(6);
        bt.add(9);
        bt.add(15);
        bt.add(1);
        bt.add(4);
        bt.add(8);
        bt.add(10);
        bt.add(13);
        bt.add(17);

        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println("===================================================");
        System.out.println("Find" + bt.find());
        bt.delete();
        bt.traversePreOrder(bt.root);
        System.out.println();
        System.out.println("===================================================");
    }
}
