import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
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
