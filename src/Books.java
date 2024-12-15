public class Books extends Item {
    String publisher;
    String category ;
    int pages;

    public Books(
            String description,
            String publisher,
            String category,
            int itemNo,
            int unitPrice,
            int pages) {
        super();

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
