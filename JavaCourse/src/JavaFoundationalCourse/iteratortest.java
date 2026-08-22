package JavaFoundationalCourse;
import java.util.*;
import java.util.Iterator;
public class iteratortest {
    public static void main(String args[]) {
        List<String> map = new LinkedList<String>();
        map.add("what");
        map.add("what");
        map.add("why");
        Iterator<String> it=map.iterator();
        it.next();
        it.remove();
        System.out.println();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }


}
