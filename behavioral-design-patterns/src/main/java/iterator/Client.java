package iterator;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        ConcreteAggregateList<Question> myCustomList = new ConcreteAggregateList<Question>();
        myCustomList.add(new Question("Q1", 1));
        myCustomList.add(new Question("Q2", 2));
        myCustomList.add(new Question("Q3", 3));
        Iterator<Question> iterator = myCustomList.iterator();
        while (iterator.hasNext()) {
            Question question = iterator.next();
            System.out.println(question.getNumber() + " => " + question.getDescription());
        }
    }
}
