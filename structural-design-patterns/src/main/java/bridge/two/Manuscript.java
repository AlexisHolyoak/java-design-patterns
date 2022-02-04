package bridge.two;

public abstract class Manuscript {

    protected Formatter formatter;

    public Manuscript(Formatter formatter) {
        this.formatter = formatter;
    }

    abstract public void print();
}