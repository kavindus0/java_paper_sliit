public class Books extends Item {
    private String publisher;
    private String category ;
    private int pages;



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
