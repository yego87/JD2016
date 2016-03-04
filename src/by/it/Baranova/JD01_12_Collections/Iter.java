package by.it.Baranova.JD01_12_Collections;

import java.util.Iterator;

/**
 * Created by Ekaterina on 3/2/16.
 */
public class Iter implements Iterable {

    @Override
    public Iterator iterator() {
        Iterator it=new Iterator() {
            int index;
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
        return null;
    }

}
