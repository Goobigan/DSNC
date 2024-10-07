import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<String>();

        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        System.out.println(names);

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }


}
