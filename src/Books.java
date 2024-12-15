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
        System.out.println(itemNo + "" + unitPrice + publisher + category + pages);
    }
}
