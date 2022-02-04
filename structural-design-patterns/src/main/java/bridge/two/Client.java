package bridge.two;

public class Client {

    public static void main(String[] args) {
        Formatter fomatter1 = new FancyFormatter();
        Book book = new Book(fomatter1);
        book.setAuthor("Robert C. Martin");
        book.setTitle("Clean Code");
        book.setText("Text of the book");
        book.print();
        System.out.println("*************************************************************");
        Formatter fomatter2 = new StandardFormatter();
        Paper paper = new Paper(fomatter2);
        paper.setAuthor("Author");
        paper.setTitle("Paper title");
        paper.setText("Text of the paper");
        paper.setReferences("References of the paper");
        paper.print();
    }
}