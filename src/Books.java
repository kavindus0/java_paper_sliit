public class Books extends Item {
    private String publisher;
    private String category;
    private int pages;

    public Books(String description, int itemNo, int unitPrice, String category, int pages, String publisher) {
        super(description, itemNo, unitPrice);
        this.category = category;
        this.pages = pages;
        this.publisher = publisher;
    }

    @Override
    public void Display() {
        System.out.println("Item No: " + itemNo);
        System.out.println("Description: " + description);
        System.out.println("publisher: " + publisher);
        System.out.println("pages: " + pages);
        System.out.println("unitPrice: " + unitPrice);
        System.out.println("category: " + category);
    }
}
