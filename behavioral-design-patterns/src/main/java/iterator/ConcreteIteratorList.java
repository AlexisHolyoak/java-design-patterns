package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteIteratorList<T> implements Iterator<T> {
    List<T> list = new ArrayList<T>();
    private int currentPosition;

    public ConcreteIteratorList(List<T> list) {
        this.list = list;
        currentPosition = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentPosition >= 0 && list.get(currentPosition) != null;
    }

    @Override
    public T next() {
        return list.get(currentPosition--);
    }
}
