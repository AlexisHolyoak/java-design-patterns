package composite.two;

public class FileComponent extends FileSystemComponent {

    private long size;

    public FileComponent(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public long getComponentSize() {
        return size;
    }
}