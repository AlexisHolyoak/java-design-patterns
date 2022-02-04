package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregateList<T> implements Iterable<T> {

    List<T> list = new ArrayList<T>();

    public ConcreteAggregateList() {
    }

    public ConcreteAggregateList(List<T> list) {
        this.list = list;
    }

    public void add(T item) {
        list.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIteratorList<T>(list);
    }
}
