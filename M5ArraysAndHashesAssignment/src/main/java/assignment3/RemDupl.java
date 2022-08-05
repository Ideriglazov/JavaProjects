package assignment3;
import java.util.*;

public class RemDupl {
    public static void remDupl(HashSet<String> names) {
        List<String> list = new ArrayList<String>(names);
        Collections.sort(list);
        System.out.println(list);
    }
}
