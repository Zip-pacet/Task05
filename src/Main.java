public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insertNode(6);
        tree.insertNode(10);
        tree.insertNode(8);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(4);
        tree.insertNode(1);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(3);


        tree.printTree();
        System.out.println(Tree.maxSum(tree));


    }
}
