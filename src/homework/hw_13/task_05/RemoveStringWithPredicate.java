package homework.hw_13.task_05;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemoveStringWithPredicate {

    public static void removeStringFromCollection (List<String> names, Predicate<String> predicate){
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            if(predicate.test(iterator.next())){
                iterator.remove();
            }
        }
    }

}
