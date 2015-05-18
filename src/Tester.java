/**
 * Created by GusSilva on 5/17/15.
 */
public class Tester {

    public static void main(String args[])
    {
        TwoThreeTree<Integer> tree = new TwoThreeTree<>();
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(0);
        tree.add(15);
        tree.add(16);
        tree.print();
    }
}
