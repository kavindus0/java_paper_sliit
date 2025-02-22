package abstract_class_question;

public class Books extends Item {
    private final String publisher;
    private final String category;
    private final int pages;

    public Books(String description, int itemNo, int unitPrice, String category, int pages, String publisher) {
        super(description, itemNo, unitPrice);
        this.category = category;
        this.pages = pages;
        this.publisher = publisher;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println(this.category);
        System.out.println(this.pages);
        System.out.println(this.publisher);
    }
}
