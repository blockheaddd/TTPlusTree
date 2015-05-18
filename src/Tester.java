import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * Created by GusSilva on 5/17/15.
 */
public class Tester {

    public static void main(String args[])
    {
        ArrayList<Integer> inserted = new ArrayList<>(0);
        Dictionary<Integer> D1 = new TwoThreePlusTree<Integer>();
        /* Random Insert
        ****
        Random rand = new Random();
        int random = 0;
        for(int i = 0; i < 15; i++)
        {
            random = rand.nextInt(50);
            System.out.println("Inserting: " + random);
            try {
                if(D1.insert(random))
                    inserted.add(random);
            }
            catch (Exception e)
            {
                System.out.println("EXCEPTION: " + e.getMessage());
            }
            D1.print();
        }
        Collections.sort(inserted);
        System.out.println("Numbers Inserted: " + inserted.toString());
        ****
        */

        Integer[] arr = {47,8,7,6,44,21,33,16,49,1,12};
        for(int i=0; i < arr.length; i++)
        {
            System.out.println("Inserting: " + arr[i]);
            try {
                D1.insert(arr[i]);
            }
            catch (Exception e)
            {
                System.out.println("EXCEPTION: " + e.getMessage());
            }
            D1.print();
        }


    }
}
