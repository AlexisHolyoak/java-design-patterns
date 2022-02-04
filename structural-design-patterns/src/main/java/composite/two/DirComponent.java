package composite.two;

import java.util.Enumeration;
import java.util.Vector;

public class DirComponent extends FileSystemComponent {
    Vector<FileSystemComponent> dirContents = new Vector<FileSystemComponent>();

    public DirComponent(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent fileSystemComponent) throws CompositeException {
        dirContents.add(fileSystemComponent);
    }

    public FileSystemComponent getComponent(int location) throws CompositeException {
        return (FileSystemComponent) dirContents.elementAt(location);
    }

    public long getComponentSize() {
        long sizeOfAllFiles = 0;
        Enumeration<FileSystemComponent> enumeration = dirContents.elements();
        while (enumeration.hasMoreElements()) {
            FileSystemComponent component = (FileSystemComponent) enumeration.nextElement();
            sizeOfAllFiles = sizeOfAllFiles + (component.getComponentSize());
        }
        return sizeOfAllFiles;
    }
}
