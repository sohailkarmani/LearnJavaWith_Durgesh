package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        list.add("Sohail Karmani");// Adding object in arraylist
        list.add("Sohail Karmani");
        list.add("Sohail Karmani");
        list.add("Sohail Karmani");
        // Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
