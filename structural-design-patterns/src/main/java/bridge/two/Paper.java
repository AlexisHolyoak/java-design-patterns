package bridge.two;

public class Paper extends Manuscript {
    private String title;
    private String author;
    private String text;
    private String references;

    public Paper(Formatter formatter) {
        super(formatter);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(formatter.format("Title", title));
        System.out.println(formatter.format("Author", author));
        System.out.println(formatter.format("Text", text));
        System.out.println(formatter.format("References", references));
    }
}