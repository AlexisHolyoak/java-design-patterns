package composite.two;

public abstract class FileSystemComponent {
    String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) throws CompositeException {
        throw new CompositeException("Invalid Operation. Not Supported");
    }

    public FileSystemComponent getComponent(int componentNum) throws CompositeException {
        throw new CompositeException("Invalid Operation. Not Supported");
    }

    public abstract long getComponentSize();
}
