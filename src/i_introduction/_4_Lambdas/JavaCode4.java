package i_introduction._4_Lambdas;


import util.JavaCode;

import java.util.Collection;
import java.util.function.Predicate;

public class JavaCode4 extends JavaCode {

    public boolean task4(Collection<Integer> collection) {
        return collection.stream().anyMatch(aBoolean -> false);
    }


}
