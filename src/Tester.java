/**
 * Created by GusSilva on 5/17/15.
 */
public class Tester {

    public static void main(String args[])
    {
        TwoThreeTree<Integer> tree = new TwoThreeTree<>();
        Dictionary<Integer> D1 = new TwoThreeTree<Integer>();
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(0);
        tree.insert(15);
        tree.insert(16);
        tree.print();
        tree.remove(0);
        tree.print();
    }
}
